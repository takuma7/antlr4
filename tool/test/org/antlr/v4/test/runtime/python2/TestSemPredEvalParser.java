package org.antlr.v4.test.runtime.python2;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class TestSemPredEvalParser extends BasePython2Test {

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testValidateInDFA() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(318);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a ';' a;\n");
		grammarBuilder.append("// ';' helps us to resynchronize without consuming\n");
		grammarBuilder.append("// 2nd 'a' reference. We our testing that the DFA also\n");
		grammarBuilder.append("// throws an exception if the validating predicate fails\n");
		grammarBuilder.append("a : {False}? ID  {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}?  INT {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x ; y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("", found);

		assertEquals(
			"line 1:0 no viable alternative at input 'x'\n" +
			"line 1:4 no viable alternative at input 'y'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testOrder() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a {} a; // do 2x: once in ATN, next in DFA;\n");
		grammarBuilder.append("// action blocks lookahead from falling off of 'a'\n");
		grammarBuilder.append("// and looking into 2nd 'a' ref. !ctx dependent pred\n");
		grammarBuilder.append("a : ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}?  ID {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 1\n" +
			"alt 1\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testNoTruePredsThrowsNoViableAlt() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(157);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a a;\n");
		grammarBuilder.append("a : {False}? ID INT {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {False}? ID INT {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="y 3 x 4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("", found);

		assertEquals("line 1:0 no viable alternative at input 'y'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDepedentPredsInGlobalFOLLOW() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(292);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {\n");
		grammarBuilder.append("def pred(self, v):\n");
		grammarBuilder.append("	print('eval=' + str(v).lower())\n");
		grammarBuilder.append("	return v\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("s : a[99] ;\n");
		grammarBuilder.append("a[int i] : e {self.pred($i==99)}? {print(\"parse\")} '!' ;\n");
		grammarBuilder.append("b[int i] : e {self.pred($i==99)}? ID ;\n");
		grammarBuilder.append("e : ID | ; // non-LL(1) so we use ATN\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a!";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"eval=true\n" +
			"parse\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDependentPredNotInOuterCtxShouldBeIgnored() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(256);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : b[2] ';' |  b[2] '.' ; // decision in s drills down to ctx-dependent pred in a;\n");
		grammarBuilder.append("b[int i] : a[i] ;\n");
		grammarBuilder.append("a[int i]\n");
		grammarBuilder.append("  : {$i==1}? ID {print(\"alt 1\")}\n");
		grammarBuilder.append("    | {$i==2}? ID {print(\"alt 2\")}\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;\n");
		String grammar = grammarBuilder.toString();


		String input ="a;";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("alt 2\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testActionHidesPreds() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(204);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {i = 0}\n");
		grammarBuilder.append("s : a+ ;\n");
		grammarBuilder.append("a : {self.i = 1} ID {self.i == 1}? {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {self.i = 2} ID {self.i == 2}? {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x x y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 1\n" +
			"alt 1\n" +
			"alt 1\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testToLeftWithVaryingPredicate() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(228);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {i = 0}\n");
		grammarBuilder.append("s : ({self.i += 1\n");
		grammarBuilder.append("print(\"i=\" + str(self.i))} a)+ ;\n");
		grammarBuilder.append("a : {self.i % 2 == 0}? ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {self.i % 2 != 0}? ID {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x x y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"i=1\n" +
			"alt 2\n" +
			"i=2\n" +
			"alt 1\n" +
			"i=3\n" +
			"alt 2\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSimpleValidate() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(150);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a ;\n");
		grammarBuilder.append("a : {False}? ID  {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}?  INT {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("", found);

		assertEquals("line 1:0 no viable alternative at input 'x'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredicateDependentOnArg() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(181);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {i = 0}\n");
		grammarBuilder.append("s : a[2] a[1];\n");
		grammarBuilder.append("a[int i]\n");
		grammarBuilder.append("  : {$i==1}? ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {$i==2}? ID {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 2\n" +
			"alt 1\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredFromAltTestedInLoopBack_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(203);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("file_\n");
		grammarBuilder.append("@after {print($ctx.toStringTree(recog=self))}\n");
		grammarBuilder.append("  : para para EOF ;\n");
		grammarBuilder.append("para: paraContent NL NL ;\n");
		grammarBuilder.append("paraContent : ('s'|'x'|{self._input.LA(2)!=TParser.NL}? NL)+ ;\n");
		grammarBuilder.append("NL : '\\n' ;\n");
		grammarBuilder.append("s : 's' ;\n");
		grammarBuilder.append("X : 'x' ;");
		String grammar = grammarBuilder.toString();


		String input =
			"s\n" +
			"\n" +
			"\n" +
			"x\n";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "file_", input, true);

		assertEquals("(file_ (para (paraContent s) \\n \\n) (para (paraContent \\n x \\n)) <EOF>)\n", found);

		assertEquals(
			"line 5:0 mismatched input '<EOF>' expecting '\n" +
			"'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredFromAltTestedInLoopBack_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(203);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("file_\n");
		grammarBuilder.append("@after {print($ctx.toStringTree(recog=self))}\n");
		grammarBuilder.append("  : para para EOF ;\n");
		grammarBuilder.append("para: paraContent NL NL ;\n");
		grammarBuilder.append("paraContent : ('s'|'x'|{self._input.LA(2)!=TParser.NL}? NL)+ ;\n");
		grammarBuilder.append("NL : '\\n' ;\n");
		grammarBuilder.append("s : 's' ;\n");
		grammarBuilder.append("X : 'x' ;");
		String grammar = grammarBuilder.toString();


		String input =
			"s\n" +
			"\n" +
			"\n" +
			"x\n" +
			"\n";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "file_", input, true);

		assertEquals("(file_ (para (paraContent s) \\n \\n) (para (paraContent \\n x) \\n \\n) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void test2UnpredicatedAltsAndOneOrthogonalAlt() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(321);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : {self._interp.predictionMode =  PredictionMode.LL_EXACT_AMBIG_DETECTION} a ';' a ';' a;\n");
		grammarBuilder.append("a : INT {print(\"alt 1\")}\n");
		grammarBuilder.append("  | ID {print(\"alt 2\")} // must pick this one for ID since pred is false\n");
		grammarBuilder.append("  | ID {print(\"alt 3\")}\n");
		grammarBuilder.append("  | {False}? ID {print(\"alt 4\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="34; x; y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, true);

		assertEquals(
			"alt 1\n" +
			"alt 2\n" +
			"alt 2\n", found);

		assertEquals(
			"line 1:4 reportAttemptingFullContext d=0 (a), input='x'\n" +
			"line 1:4 reportAmbiguity d=0 (a): ambigAlts={2, 3}, input='x'\n" +
			"line 1:7 reportAttemptingFullContext d=0 (a), input='y'\n" +
			"line 1:7 reportAmbiguity d=0 (a): ambigAlts={2, 3}, input='y'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testUnpredicatedPathsInAlt() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(169);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a {print(\"alt 1\")}\n");
		grammarBuilder.append("  | b {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("a : {False}? ID INT\n");
		grammarBuilder.append("  | ID INT\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("b : ID ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x 4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("alt 1\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testToLeft() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(150);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("	s : a+ ;\n");
		grammarBuilder.append("a : {False}? ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}?  ID {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x x y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 2\n" +
			"alt 2\n" +
			"alt 2\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void test2UnpredicatedAlts() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(276);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : {self._interp.predictionMode =  PredictionMode.LL_EXACT_AMBIG_DETECTION} a ';' a; // do 2x: once in ATN, next in DFA\n");
		grammarBuilder.append("a : ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | ID {print(\"alt 2\")}\n");
		grammarBuilder.append("  | {False}? ID {print(\"alt 3\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x; y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, true);

		assertEquals(
			"alt 1\n" +
			"alt 1\n", found);

		assertEquals(
			"line 1:0 reportAttemptingFullContext d=0 (a), input='x'\n" +
			"line 1:0 reportAmbiguity d=0 (a): ambigAlts={1, 2}, input='x'\n" +
			"line 1:3 reportAttemptingFullContext d=0 (a), input='y'\n" +
			"line 1:3 reportAmbiguity d=0 (a): ambigAlts={1, 2}, input='y'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testRewindBeforePredEval() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(201);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a a;\n");
		grammarBuilder.append("a : {self._input.LT(1).text==\"x\"}? ID INT {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {self._input.LT(1).text==\"y\"}? ID INT {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="y 3 x 4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 2\n" +
			"alt 1\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDisabledAlternative() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(121);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("cppCompilationUnit : content+ EOF;\n");
		grammarBuilder.append("content: anything | {False}? .;\n");
		grammarBuilder.append("anything: ANY_CHAR;\n");
		grammarBuilder.append("ANY_CHAR: [_a-zA-Z0-9];");
		String grammar = grammarBuilder.toString();


		String input ="hello";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "cppCompilationUnit", input, false);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testIndependentPredNotPassedOuterCtxToAvoidCastException() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(169);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : b ';' |  b '.' ;\n");
		grammarBuilder.append("b : a ;\n");
		grammarBuilder.append("a\n");
		grammarBuilder.append("  : {False}? ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}? ID {print(\"alt 2\")}\n");
		grammarBuilder.append(" ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a;";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("alt 2\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredsInGlobalFOLLOW() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(263);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {\n");
		grammarBuilder.append("def pred(self, v):\n");
		grammarBuilder.append("	print('eval=' + str(v).lower())\n");
		grammarBuilder.append("	return v\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("s : e {self.pred(True)}? {print(\"parse\")} '!' ;\n");
		grammarBuilder.append("t : e {self.pred(False)}? ID ;\n");
		grammarBuilder.append("e : ID | ; // non-LL(1) so we use ATN\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a!";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"eval=true\n" +
			"parse\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSimple() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(235);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a a a; // do 3x: once in ATN, next in DFA then INT in ATN\n");
		grammarBuilder.append("a : {False}? ID {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}?  ID {print(\"alt 2\")}\n");
		grammarBuilder.append("  | INT         {print(\"alt 3\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y 3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 2\n" +
			"alt 2\n" +
			"alt 3\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSimpleValidate2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(153);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : a a a;\n");
		grammarBuilder.append("a : {False}? ID  {print(\"alt 1\")}\n");
		grammarBuilder.append("  | {True}?  INT {print(\"alt 2\")}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="3 4 x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"alt 2\n" +
			"alt 2\n", found);

		assertEquals("line 1:4 no viable alternative at input 'x'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredTestedEvenWhenUnAmbig_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(184);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {enumKeyword = True}\n");
		grammarBuilder.append("primary\n");
		grammarBuilder.append("    :   ID {print(\"ID \"+$ID.text)}\n");
		grammarBuilder.append("    |   {not self.enumKeyword}? 'enum' {print(\"enum\")}\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n\\r]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="abc";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "primary", input, false);

		assertEquals("ID abc\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredTestedEvenWhenUnAmbig_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(184);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {enumKeyword = True}\n");
		grammarBuilder.append("primary\n");
		grammarBuilder.append("    :   ID {print(\"ID \"+$ID.text)}\n");
		grammarBuilder.append("    |   {not self.enumKeyword}? 'enum' {print(\"enum\")}\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n\\r]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="enum";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "primary", input, false);

		assertEquals("", found);

		assertEquals("line 1:0 no viable alternative at input 'enum'\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testActionsHidePredsInGlobalFOLLOW() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(269);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {\n");
		grammarBuilder.append("def pred(self, v):\n");
		grammarBuilder.append("	print('eval=' + str(v).lower())\n");
		grammarBuilder.append("	return v\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("s : e {} {self.pred(True)}? {print(\"parse\")} '!' ;\n");
		grammarBuilder.append("t : e {} {self.pred(False)}? ID ;\n");
		grammarBuilder.append("e : ID | ; // non-LL(1) so we use ATN\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a!";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals(
			"eval=true\n" +
			"parse\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPredicateDependentOnArg2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(149);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@members {i = 0}\n");
		grammarBuilder.append("s : a[2] a[1];\n");
		grammarBuilder.append("a[int i]\n");
		grammarBuilder.append("  : {$i==1}? ID \n");
		grammarBuilder.append("  | {$i==2}? ID \n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testAtomWithClosureInTranslatedLRRule() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(94);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("start : e[0] EOF;\n");
		grammarBuilder.append("e[int _p]\n");
		grammarBuilder.append("    :   ( 'a' | 'b'+ ) ( {3 >= $_p}? '+' e[4] )*\n");
		grammarBuilder.append("    ;\n");
		String grammar = grammarBuilder.toString();


		String input ="a+b+a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "start", input, false);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}


}
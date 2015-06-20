package org.antlr.v4.test.runtime.python2;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class TestLeftRecursion extends BasePython2Test {

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_5() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a=b=c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) = (e (e b) = (e c))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_6() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b+c:d";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e (e b) + (e c)) : (e d)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_7() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b=c:d";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e (e b) = (e c)) : (e d)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_8() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a? b?c:d : e";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e (e b) ? (e c) : (e d)) : (e e)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e a) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a+b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) + (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a*b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) * (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b:c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e b) : (e c)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList1_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(300);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr (',' b+=expr)* '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a,c>>x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr (expr a) , (expr c) >> (expr x)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList1_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(300);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr (',' b+=expr)* '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a*b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr (expr a) * (expr b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testLabelsOnOpSubrule_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(170);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}\n");
		grammarBuilder.append("  | INT {}\n");
		grammarBuilder.append("  | '(' x=e ')' {}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e 4))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleActions_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(177);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e ;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}{}\n");
		grammarBuilder.append("  | INT {}{}\n");
		grammarBuilder.append("  | '(' x=e ')' {}{}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e 4))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testLabelsOnOpSubrule_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(170);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}\n");
		grammarBuilder.append("  | INT {}\n");
		grammarBuilder.append("  | '(' x=e ')' {}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(1/2)*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e ( (e (e 1) / (e 2)) )) * (e 3)))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testLabelsOnOpSubrule_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(170);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}\n");
		grammarBuilder.append("  | INT {}\n");
		grammarBuilder.append("  | '(' x=e ')' {}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1*2/3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e (e 1) * (e 2)) / (e 3)))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsAndLabels_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(447);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : q=e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : a=e op='*' b=e {$v = $a.v * $b.v;}  # mult\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}     # add\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}        # anInt\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}            # parens\n");
		grammarBuilder.append("  | x=e '++'    {$v = $x.v+1;}          # inc\n");
		grammarBuilder.append("  | e '--'                              # dec\n");
		grammarBuilder.append("  | ID          {$v = 3;}               # anID\n");
		grammarBuilder.append("  ; \n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1+2";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("3\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsAndLabels_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(447);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : q=e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : a=e op='*' b=e {$v = $a.v * $b.v;}  # mult\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}     # add\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}        # anInt\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}            # parens\n");
		grammarBuilder.append("  | x=e '++'    {$v = $x.v+1;}          # inc\n");
		grammarBuilder.append("  | e '--'                              # dec\n");
		grammarBuilder.append("  | ID          {$v = 3;}               # anID\n");
		grammarBuilder.append("  ; \n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1+2*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("7\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsAndLabels_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(447);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : q=e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : a=e op='*' b=e {$v = $a.v * $b.v;}  # mult\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}     # add\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}        # anInt\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}            # parens\n");
		grammarBuilder.append("  | x=e '++'    {$v = $x.v+1;}          # inc\n");
		grammarBuilder.append("  | e '--'                              # dec\n");
		grammarBuilder.append("  | ID          {$v = 3;}               # anID\n");
		grammarBuilder.append("  ; \n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("4\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSimple_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(127);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : a ;\n");
		grammarBuilder.append("a : a ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (a x))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExprExplicitAssociativity_9() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(283);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e :<assoc=right> e '*' e\n");
		grammarBuilder.append("  |<assoc=right> e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b: c?d:e";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e b) : (e (e c) ? (e d) : (e e))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSemPredFailOption() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(159);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : a ;\n");
		grammarBuilder.append("a : a ID {False}?<fail='custom message'>\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y z";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (a (a x) y z))\n", found);

		assertEquals("line 1:4 rule a custom message\n", this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSimple_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(127);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : a ;\n");
		grammarBuilder.append("a : a ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (a (a x) y))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsAndLabels_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(447);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : q=e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : a=e op='*' b=e {$v = $a.v * $b.v;}  # mult\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}     # add\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}        # anInt\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}            # parens\n");
		grammarBuilder.append("  | x=e '++'    {$v = $x.v+1;}          # inc\n");
		grammarBuilder.append("  | e '--'                              # dec\n");
		grammarBuilder.append("  | ID          {$v = 3;}               # anID\n");
		grammarBuilder.append("  ; \n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="i++*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("12\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSimple_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(127);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : a ;\n");
		grammarBuilder.append("a : a ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y z";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (a (a (a x) y) z))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testWhitespaceInfluence_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(2763);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog : expression EOF;\n");
		grammarBuilder.append("expression\n");
		grammarBuilder.append("    : ID '(' expression (',' expression)* ')'               # doFunction\n");
		grammarBuilder.append("    | '(' expression ')'                                    # doParenthesis\n");
		grammarBuilder.append("    | '!' expression                                        # doNot\n");
		grammarBuilder.append("    | '-' expression                                        # doNegate\n");
		grammarBuilder.append("    | '+' expression                                        # doPositiv\n");
		grammarBuilder.append("    | expression '^' expression                             # doPower\n");
		grammarBuilder.append("    | expression '*' expression                             # doMultipy\n");
		grammarBuilder.append("    | expression '/' expression                             # doDivide\n");
		grammarBuilder.append("    | expression '%' expression                             # doModulo\n");
		grammarBuilder.append("    | expression '-' expression                             # doMinus\n");
		grammarBuilder.append("    | expression '+' expression                             # doPlus\n");
		grammarBuilder.append("    | expression '=' expression                             # doEqual\n");
		grammarBuilder.append("    | expression '!=' expression                            # doNotEqual\n");
		grammarBuilder.append("    | expression '>' expression                             # doGreather\n");
		grammarBuilder.append("    | expression '>=' expression                            # doGreatherEqual\n");
		grammarBuilder.append("    | expression '<' expression                             # doLesser\n");
		grammarBuilder.append("    | expression '<=' expression                            # doLesserEqual\n");
		grammarBuilder.append("    | expression K_IN '(' expression (',' expression)* ')'  # doIn\n");
		grammarBuilder.append("    | expression ( '&' | K_AND) expression                  # doAnd\n");
		grammarBuilder.append("    | expression ( '|' | K_OR) expression                   # doOr\n");
		grammarBuilder.append("    | '[' expression (',' expression)* ']'                  # newArray\n");
		grammarBuilder.append("    | K_TRUE                                                # newTrueBoolean\n");
		grammarBuilder.append("    | K_FALSE                                               # newFalseBoolean\n");
		grammarBuilder.append("    | NUMBER                                                # newNumber\n");
		grammarBuilder.append("    | DATE                                                  # newDateTime\n");
		grammarBuilder.append("    | ID                                                    # newIdentifier\n");
		grammarBuilder.append("    | SQ_STRING                                             # newString\n");
		grammarBuilder.append("    | K_NULL                                                # newNull\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("// Fragments\n");
		grammarBuilder.append("fragment DIGIT    : '0' .. '9';  \n");
		grammarBuilder.append("fragment UPPER    : 'A' .. 'Z';\n");
		grammarBuilder.append("fragment LOWER    : 'a' .. 'z';\n");
		grammarBuilder.append("fragment LETTER   : LOWER | UPPER;\n");
		grammarBuilder.append("fragment WORD     : LETTER | '_' | '$' | '#' | '.';\n");
		grammarBuilder.append("fragment ALPHANUM : WORD | DIGIT;  \n");
		grammarBuilder.append("\n");
		grammarBuilder.append("// Tokens\n");
		grammarBuilder.append("ID              : LETTER ALPHANUM*;\n");
		grammarBuilder.append("NUMBER          : DIGIT+ ('.' DIGIT+)? (('e'|'E')('+'|'-')? DIGIT+)?;\n");
		grammarBuilder.append("DATE            : '\\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT (' ' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT ('.' DIGIT+)?)? '\\'';\n");
		grammarBuilder.append("SQ_STRING       : '\\'' ('\\'\\'' | ~'\\'')* '\\'';\n");
		grammarBuilder.append("DQ_STRING       : '\"' ('\\\\\"' | ~'\"')* '\"';\n");
		grammarBuilder.append("WS              : [ \\t\\n\\r]+ -> skip ;\n");
		grammarBuilder.append("COMMENTS        : ('/*' .*? '*/' | '//' ~'\\n'* '\\n' ) -> skip;");
		String grammar = grammarBuilder.toString();


		String input ="Test(1, 3)";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, false);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testWhitespaceInfluence_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(2763);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog : expression EOF;\n");
		grammarBuilder.append("expression\n");
		grammarBuilder.append("    : ID '(' expression (',' expression)* ')'               # doFunction\n");
		grammarBuilder.append("    | '(' expression ')'                                    # doParenthesis\n");
		grammarBuilder.append("    | '!' expression                                        # doNot\n");
		grammarBuilder.append("    | '-' expression                                        # doNegate\n");
		grammarBuilder.append("    | '+' expression                                        # doPositiv\n");
		grammarBuilder.append("    | expression '^' expression                             # doPower\n");
		grammarBuilder.append("    | expression '*' expression                             # doMultipy\n");
		grammarBuilder.append("    | expression '/' expression                             # doDivide\n");
		grammarBuilder.append("    | expression '%' expression                             # doModulo\n");
		grammarBuilder.append("    | expression '-' expression                             # doMinus\n");
		grammarBuilder.append("    | expression '+' expression                             # doPlus\n");
		grammarBuilder.append("    | expression '=' expression                             # doEqual\n");
		grammarBuilder.append("    | expression '!=' expression                            # doNotEqual\n");
		grammarBuilder.append("    | expression '>' expression                             # doGreather\n");
		grammarBuilder.append("    | expression '>=' expression                            # doGreatherEqual\n");
		grammarBuilder.append("    | expression '<' expression                             # doLesser\n");
		grammarBuilder.append("    | expression '<=' expression                            # doLesserEqual\n");
		grammarBuilder.append("    | expression K_IN '(' expression (',' expression)* ')'  # doIn\n");
		grammarBuilder.append("    | expression ( '&' | K_AND) expression                  # doAnd\n");
		grammarBuilder.append("    | expression ( '|' | K_OR) expression                   # doOr\n");
		grammarBuilder.append("    | '[' expression (',' expression)* ']'                  # newArray\n");
		grammarBuilder.append("    | K_TRUE                                                # newTrueBoolean\n");
		grammarBuilder.append("    | K_FALSE                                               # newFalseBoolean\n");
		grammarBuilder.append("    | NUMBER                                                # newNumber\n");
		grammarBuilder.append("    | DATE                                                  # newDateTime\n");
		grammarBuilder.append("    | ID                                                    # newIdentifier\n");
		grammarBuilder.append("    | SQ_STRING                                             # newString\n");
		grammarBuilder.append("    | K_NULL                                                # newNull\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("// Fragments\n");
		grammarBuilder.append("fragment DIGIT    : '0' .. '9';  \n");
		grammarBuilder.append("fragment UPPER    : 'A' .. 'Z';\n");
		grammarBuilder.append("fragment LOWER    : 'a' .. 'z';\n");
		grammarBuilder.append("fragment LETTER   : LOWER | UPPER;\n");
		grammarBuilder.append("fragment WORD     : LETTER | '_' | '$' | '#' | '.';\n");
		grammarBuilder.append("fragment ALPHANUM : WORD | DIGIT;  \n");
		grammarBuilder.append("\n");
		grammarBuilder.append("// Tokens\n");
		grammarBuilder.append("ID              : LETTER ALPHANUM*;\n");
		grammarBuilder.append("NUMBER          : DIGIT+ ('.' DIGIT+)? (('e'|'E')('+'|'-')? DIGIT+)?;\n");
		grammarBuilder.append("DATE            : '\\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT (' ' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT ('.' DIGIT+)?)? '\\'';\n");
		grammarBuilder.append("SQ_STRING       : '\\'' ('\\'\\'' | ~'\\'')* '\\'';\n");
		grammarBuilder.append("DQ_STRING       : '\"' ('\\\\\"' | ~'\"')* '\"';\n");
		grammarBuilder.append("WS              : [ \\t\\n\\r]+ -> skip ;\n");
		grammarBuilder.append("COMMENTS        : ('/*' .*? '*/' | '//' ~'\\n'* '\\n' ) -> skip;");
		String grammar = grammarBuilder.toString();


		String input ="Test(1,3)";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, false);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_9() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(T)t.f()";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e ( (typespec T) ) (e (e t) . f)) ( )) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_8() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="new A().b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e new (typespec A) ( )) . b) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testSemPred() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(135);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : a ;\n");
		grammarBuilder.append("a : a {True}? ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y z";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (a (a (a x) y) z))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_7() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(T)x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e ( (typespec T) ) (e x)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_6() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a^b^c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ^ (e (e b) ^ (e c))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testAmbigLR_5() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(705);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog:   stat ;\n");
		grammarBuilder.append("stat:   expr NEWLINE                # printExpr\n");
		grammarBuilder.append("    |   ID '=' expr NEWLINE         # assign\n");
		grammarBuilder.append("    |   NEWLINE                     # blank\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("expr:   expr ('*'|'/') expr      # MulDiv\n");
		grammarBuilder.append("    |   expr ('+'|'-') expr      # AddSub\n");
		grammarBuilder.append("    |   INT                      # int\n");
		grammarBuilder.append("    |   ID                       # id\n");
		grammarBuilder.append("    |   '(' expr ')'             # parens\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("MUL :   '*' ; // assigns token name to '*' used above in grammar\n");
		grammarBuilder.append("DIV :   '/' ;\n");
		grammarBuilder.append("ADD :   '+' ;\n");
		grammarBuilder.append("SUB :   '-' ;\n");
		grammarBuilder.append("ID  :   [a-zA-Z]+ ;      // match identifiers\n");
		grammarBuilder.append("INT :   [0-9]+ ;         // match integers\n");
		grammarBuilder.append("NEWLINE:'\\r'? '\\n' ;     // return newlines to parser (is end-statement signal)\n");
		grammarBuilder.append("WS  :   [ \\t]+ -> skip ; // toss out whitespace");
		String grammar = grammarBuilder.toString();


		String input ="(1+2)*3\n";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, true);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActions_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(235);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v,  ignored]\n");
		grammarBuilder.append("  : a=e '*' b=e {$v = $a.v * $b.v;}\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}\n");
		grammarBuilder.append("  | INT {$v = $INT.int;}\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;\n");
		String grammar = grammarBuilder.toString();


		String input ="4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("4\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleActions_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(177);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e ;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}{}\n");
		grammarBuilder.append("  | INT {}{}\n");
		grammarBuilder.append("  | '(' x=e ')' {}{}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1*2/3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e (e 1) * (e 2)) / (e 3)))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActions_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(235);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v,  ignored]\n");
		grammarBuilder.append("  : a=e '*' b=e {$v = $a.v * $b.v;}\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}\n");
		grammarBuilder.append("  | INT {$v = $INT.int;}\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;\n");
		String grammar = grammarBuilder.toString();


		String input ="1+2*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("7\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleActions_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(177);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e ;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}{}\n");
		grammarBuilder.append("  | INT {}{}\n");
		grammarBuilder.append("  | '(' x=e ')' {}{}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(1/2)*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e ( (e (e 1) / (e 2)) )) * (e 3)))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActions_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(235);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v,  ignored]\n");
		grammarBuilder.append("  : a=e '*' b=e {$v = $a.v * $b.v;}\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}\n");
		grammarBuilder.append("  | INT {$v = $INT.int;}\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;\n");
		String grammar = grammarBuilder.toString();


		String input ="1+2";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("3\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testAmbigLR_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(705);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog:   stat ;\n");
		grammarBuilder.append("stat:   expr NEWLINE                # printExpr\n");
		grammarBuilder.append("    |   ID '=' expr NEWLINE         # assign\n");
		grammarBuilder.append("    |   NEWLINE                     # blank\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("expr:   expr ('*'|'/') expr      # MulDiv\n");
		grammarBuilder.append("    |   expr ('+'|'-') expr      # AddSub\n");
		grammarBuilder.append("    |   INT                      # int\n");
		grammarBuilder.append("    |   ID                       # id\n");
		grammarBuilder.append("    |   '(' expr ')'             # parens\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("MUL :   '*' ; // assigns token name to '*' used above in grammar\n");
		grammarBuilder.append("DIV :   '/' ;\n");
		grammarBuilder.append("ADD :   '+' ;\n");
		grammarBuilder.append("SUB :   '-' ;\n");
		grammarBuilder.append("ID  :   [a-zA-Z]+ ;      // match identifiers\n");
		grammarBuilder.append("INT :   [0-9]+ ;         // match integers\n");
		grammarBuilder.append("NEWLINE:'\\r'? '\\n' ;     // return newlines to parser (is end-statement signal)\n");
		grammarBuilder.append("WS  :   [ \\t]+ -> skip ; // toss out whitespace");
		String grammar = grammarBuilder.toString();


		String input ="a = 5\n";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, true);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_10() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(*a)[]";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator (declarator ( (declarator * (declarator a)) )) [ ]) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testAmbigLR_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(705);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog:   stat ;\n");
		grammarBuilder.append("stat:   expr NEWLINE                # printExpr\n");
		grammarBuilder.append("    |   ID '=' expr NEWLINE         # assign\n");
		grammarBuilder.append("    |   NEWLINE                     # blank\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("expr:   expr ('*'|'/') expr      # MulDiv\n");
		grammarBuilder.append("    |   expr ('+'|'-') expr      # AddSub\n");
		grammarBuilder.append("    |   INT                      # int\n");
		grammarBuilder.append("    |   ID                       # id\n");
		grammarBuilder.append("    |   '(' expr ')'             # parens\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("MUL :   '*' ; // assigns token name to '*' used above in grammar\n");
		grammarBuilder.append("DIV :   '/' ;\n");
		grammarBuilder.append("ADD :   '+' ;\n");
		grammarBuilder.append("SUB :   '-' ;\n");
		grammarBuilder.append("ID  :   [a-zA-Z]+ ;      // match identifiers\n");
		grammarBuilder.append("INT :   [0-9]+ ;         // match integers\n");
		grammarBuilder.append("NEWLINE:'\\r'? '\\n' ;     // return newlines to parser (is end-statement signal)\n");
		grammarBuilder.append("WS  :   [ \\t]+ -> skip ; // toss out whitespace");
		String grammar = grammarBuilder.toString();


		String input ="1\n";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, true);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActions_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(235);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)}; \n");
		grammarBuilder.append("e returns [int v,  ignored]\n");
		grammarBuilder.append("  : a=e '*' b=e {$v = $a.v * $b.v;}\n");
		grammarBuilder.append("  | a=e '+' b=e {$v = $a.v + $b.v;}\n");
		grammarBuilder.append("  | INT {$v = $INT.int;}\n");
		grammarBuilder.append("  | '(' x=e ')' {$v = $x.v;}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;\n");
		String grammar = grammarBuilder.toString();


		String input ="(1+2)*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("9\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testAmbigLR_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(705);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog:   stat ;\n");
		grammarBuilder.append("stat:   expr NEWLINE                # printExpr\n");
		grammarBuilder.append("    |   ID '=' expr NEWLINE         # assign\n");
		grammarBuilder.append("    |   NEWLINE                     # blank\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("expr:   expr ('*'|'/') expr      # MulDiv\n");
		grammarBuilder.append("    |   expr ('+'|'-') expr      # AddSub\n");
		grammarBuilder.append("    |   INT                      # int\n");
		grammarBuilder.append("    |   ID                       # id\n");
		grammarBuilder.append("    |   '(' expr ')'             # parens\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("MUL :   '*' ; // assigns token name to '*' used above in grammar\n");
		grammarBuilder.append("DIV :   '/' ;\n");
		grammarBuilder.append("ADD :   '+' ;\n");
		grammarBuilder.append("SUB :   '-' ;\n");
		grammarBuilder.append("ID  :   [a-zA-Z]+ ;      // match identifiers\n");
		grammarBuilder.append("INT :   [0-9]+ ;         // match integers\n");
		grammarBuilder.append("NEWLINE:'\\r'? '\\n' ;     // return newlines to parser (is end-statement signal)\n");
		grammarBuilder.append("WS  :   [ \\t]+ -> skip ; // toss out whitespace");
		String grammar = grammarBuilder.toString();


		String input ="a+b*2\n";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, true);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testAmbigLR_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(705);
		grammarBuilder.append("grammar Expr;\n");
		grammarBuilder.append("prog:   stat ;\n");
		grammarBuilder.append("stat:   expr NEWLINE                # printExpr\n");
		grammarBuilder.append("    |   ID '=' expr NEWLINE         # assign\n");
		grammarBuilder.append("    |   NEWLINE                     # blank\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("expr:   expr ('*'|'/') expr      # MulDiv\n");
		grammarBuilder.append("    |   expr ('+'|'-') expr      # AddSub\n");
		grammarBuilder.append("    |   INT                      # int\n");
		grammarBuilder.append("    |   ID                       # id\n");
		grammarBuilder.append("    |   '(' expr ')'             # parens\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("MUL :   '*' ; // assigns token name to '*' used above in grammar\n");
		grammarBuilder.append("DIV :   '/' ;\n");
		grammarBuilder.append("ADD :   '+' ;\n");
		grammarBuilder.append("SUB :   '-' ;\n");
		grammarBuilder.append("ID  :   [a-zA-Z]+ ;      // match identifiers\n");
		grammarBuilder.append("INT :   [0-9]+ ;         // match integers\n");
		grammarBuilder.append("NEWLINE:'\\r'? '\\n' ;     // return newlines to parser (is end-statement signal)\n");
		grammarBuilder.append("WS  :   [ \\t]+ -> skip ; // toss out whitespace");
		String grammar = grammarBuilder.toString();


		String input ="b = 6\n";
		String found = execParser("Expr.g4", grammar, "ExprParser", "ExprLexer", "ExprListener", "ExprVisitor", "prog", input, true);

		assertEquals("", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a >> b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) >> (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_5() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a=b=c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) = (e (e b) = (e c))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(a|b)&c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e ( (e (e a) | (e b)) )) & (e c)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a > b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) > (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a|b&c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) | (e (e b) & (e c))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a[3]";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator (declarator a) [ (e 3) ]) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_5() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="b[]";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator (declarator b) [ ]) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="*a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator * (declarator a)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="**a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator * (declarator * (declarator a))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator a) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPrefixOpWithActionAndLabel_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(329);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.result)} ;\n");
		grammarBuilder.append("e returns [String result]\n");
		grammarBuilder.append("    :   ID '=' e1=e    {$result = \"(\" + $ID.text + \"=\" + $e1.result + \")\";}\n");
		grammarBuilder.append("    |   ID             {$result = $ID.text;}\n");
		grammarBuilder.append("    |   e1=e '+' e2=e  {$result = \"(\" + $e1.result + \"+\" + $e2.result + \")\";}\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a=b+c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("((a=b)+c)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e a) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a-1";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) - (e 1)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e 1) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleActionsPredicatesOptions_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(239);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e ;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}{True}?\n");
		grammarBuilder.append("  | a=e op=('+'|'-') b=e  {}<p=3>{True}?<fail='Message'>\n");
		grammarBuilder.append("  | INT {}{}\n");
		grammarBuilder.append("  | '(' x=e ')' {}{}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(1/2)*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e ( (e (e 1) / (e 2)) )) * (e 3)))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a.b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) . b) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleActionsPredicatesOptions_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(239);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e ;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}{True}?\n");
		grammarBuilder.append("  | a=e op=('+'|'-') b=e  {}<p=3>{True}?<fail='Message'>\n");
		grammarBuilder.append("  | INT {}{}\n");
		grammarBuilder.append("  | '(' x=e ')' {}{}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1*2/3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e (e 1) * (e 2)) / (e 3)))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_5() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a.this";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) . this) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_6() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="-a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e - (e a)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testExpressions_7() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(250);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("e : e '.' ID\n");
		grammarBuilder.append("  | e '.' 'this'\n");
		grammarBuilder.append("  | '-' e\n");
		grammarBuilder.append("  | e '*' e\n");
		grammarBuilder.append("  | e ('+'|'-') e\n");
		grammarBuilder.append("  | INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="-a+b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e - (e a)) + (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleAlternativesWithCommonLabel_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(561);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)};\n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : e '*' e     {$v = $ctx.e(0).v * $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | e '+' e     {$v = $ctx.e(0).v + $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}                   # anInt\n");
		grammarBuilder.append("  | '(' e ')'   {$v = $e.v;}                       # parens\n");
		grammarBuilder.append("  | left=e INC  {$v = $left.v + 1;}      # unary\n");
		grammarBuilder.append("  | left=e DEC  {$v = $left.v - 1;}      # unary\n");
		grammarBuilder.append("  | ID          {$v = 3}                                                     # anID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("INC : '++' ;\n");
		grammarBuilder.append("DEC : '--' ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="i++*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("12\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleAlternativesWithCommonLabel_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(561);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)};\n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : e '*' e     {$v = $ctx.e(0).v * $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | e '+' e     {$v = $ctx.e(0).v + $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}                   # anInt\n");
		grammarBuilder.append("  | '(' e ')'   {$v = $e.v;}                       # parens\n");
		grammarBuilder.append("  | left=e INC  {$v = $left.v + 1;}      # unary\n");
		grammarBuilder.append("  | left=e DEC  {$v = $left.v - 1;}      # unary\n");
		grammarBuilder.append("  | ID          {$v = 3}                                                     # anID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("INC : '++' ;\n");
		grammarBuilder.append("DEC : '--' ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1+2*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("7\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleAlternativesWithCommonLabel_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(561);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)};\n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : e '*' e     {$v = $ctx.e(0).v * $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | e '+' e     {$v = $ctx.e(0).v + $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}                   # anInt\n");
		grammarBuilder.append("  | '(' e ')'   {$v = $e.v;}                       # parens\n");
		grammarBuilder.append("  | left=e INC  {$v = $left.v + 1;}      # unary\n");
		grammarBuilder.append("  | left=e DEC  {$v = $left.v - 1;}      # unary\n");
		grammarBuilder.append("  | ID          {$v = 3}                                                     # anID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("INC : '++' ;\n");
		grammarBuilder.append("DEC : '--' ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="1+2";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("3\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleAlternativesWithCommonLabel_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(561);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.v)};\n");
		grammarBuilder.append("e returns [int v]\n");
		grammarBuilder.append("  : e '*' e     {$v = $ctx.e(0).v * $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | e '+' e     {$v = $ctx.e(0).v + $ctx.e(1).v;}  # binary\n");
		grammarBuilder.append("  | INT         {$v = $INT.int;}                   # anInt\n");
		grammarBuilder.append("  | '(' e ')'   {$v = $e.v;}                       # parens\n");
		grammarBuilder.append("  | left=e INC  {$v = $left.v + 1;}      # unary\n");
		grammarBuilder.append("  | left=e DEC  {$v = $left.v - 1;}      # unary\n");
		grammarBuilder.append("  | ID          {$v = 3}                                                     # anID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("INC : '++' ;\n");
		grammarBuilder.append("DEC : '--' ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("4\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_11() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a.f().g(x,1)";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e (e (e (e a) . f) ( )) . g) ( (expressionList (e x) , (e 1)) )) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_12() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="new T[((n-1) * x) + 1]";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e new (typespec T) [ (e (e ( (e (e ( (e (e n) - (e 1)) )) * (e x)) )) + (e 1)) ]) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testJavaExpressions_10() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(1247);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("expressionList\n");
		grammarBuilder.append("    :   e (',' e)*\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("e   :   '(' e ')'\n");
		grammarBuilder.append("    |   'this'\n");
		grammarBuilder.append("    |   'super'\n");
		grammarBuilder.append("    |   INT\n");
		grammarBuilder.append("    |   ID\n");
		grammarBuilder.append("    |   typespec '.' 'class'\n");
		grammarBuilder.append("    |   e '.' ID\n");
		grammarBuilder.append("    |   e '.' 'this'\n");
		grammarBuilder.append("    |   e '.' 'super' '(' expressionList? ')'\n");
		grammarBuilder.append("    |   e '.' 'new' ID '(' expressionList? ')'\n");
		grammarBuilder.append("	|   'new' typespec ( '(' expressionList? ')' | ('[' e ']')+)\n");
		grammarBuilder.append("    |   e '[' e ']'\n");
		grammarBuilder.append("    |   '(' typespec ')' e\n");
		grammarBuilder.append("    |   e ('++' | '--')\n");
		grammarBuilder.append("    |   e '(' expressionList? ')'\n");
		grammarBuilder.append("    |   ('+'|'-'|'++'|'--') e\n");
		grammarBuilder.append("    |   ('~'|'!') e\n");
		grammarBuilder.append("    |   e ('*'|'/'|'%') e\n");
		grammarBuilder.append("    |   e ('+'|'-') e\n");
		grammarBuilder.append("    |   e ('<<' | '>>>' | '>>') e\n");
		grammarBuilder.append("    |   e ('<=' | '>=' | '>' | '<') e\n");
		grammarBuilder.append("    |   e 'instanceof' e\n");
		grammarBuilder.append("    |   e ('==' | '!=') e\n");
		grammarBuilder.append("    |   e '&' e\n");
		grammarBuilder.append("    |<assoc=right> e '^' e\n");
		grammarBuilder.append("    |   e '|' e\n");
		grammarBuilder.append("    |   e '&&' e\n");
		grammarBuilder.append("    |   e '||' e\n");
		grammarBuilder.append("    |   e '?' e ':' e\n");
		grammarBuilder.append("    |<assoc=right>\n");
		grammarBuilder.append("        e ('='\n");
		grammarBuilder.append("          |'+='\n");
		grammarBuilder.append("          |'-='\n");
		grammarBuilder.append("          |'*='\n");
		grammarBuilder.append("          |'/='\n");
		grammarBuilder.append("          |'&='\n");
		grammarBuilder.append("          |'|='\n");
		grammarBuilder.append("          |'^='\n");
		grammarBuilder.append("          |'>>='\n");
		grammarBuilder.append("          |'>>>='\n");
		grammarBuilder.append("          |'<<='\n");
		grammarBuilder.append("          |'%=') e\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("typespec\n");
		grammarBuilder.append("    : ID\n");
		grammarBuilder.append("    | ID '[' ']'\n");
		grammarBuilder.append("    | 'int'\n");
		grammarBuilder.append("	| 'int' '[' ']'\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : ('a'..'z'|'A'..'Z'|'_'|'$')+;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a.f(x)==T.c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e (e (e a) . f) ( (expressionList (e x)) )) == (e (e T) . c)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_9() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="*a[]";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator * (declarator (declarator a) [ ])) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_8() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a[][]";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator (declarator (declarator a) [ ]) [ ]) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testMultipleActionsPredicatesOptions_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(239);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e ;\n");
		grammarBuilder.append("e : a=e op=('*'|'/') b=e  {}{True}?\n");
		grammarBuilder.append("  | a=e op=('+'|'-') b=e  {}<p=3>{True}?<fail='Message'>\n");
		grammarBuilder.append("  | INT {}{}\n");
		grammarBuilder.append("  | '(' x=e ')' {}{}\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="4";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e 4))\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_7() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a[]()";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator (declarator (declarator a) [ ]) ( )) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDeclarations_6() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(391);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : declarator EOF ; // must indicate EOF can follow\n");
		grammarBuilder.append("declarator\n");
		grammarBuilder.append("        : declarator '[' e ']'\n");
		grammarBuilder.append("        | declarator '[' ']'\n");
		grammarBuilder.append("        | declarator '(' ')'\n");
		grammarBuilder.append("        | '*' declarator // binds less tight than suffixes\n");
		grammarBuilder.append("        | '(' declarator ')'\n");
		grammarBuilder.append("        | ID\n");
		grammarBuilder.append("        ;\n");
		grammarBuilder.append("e : INT ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="(a)";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (declarator ( (declarator a) )) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a+b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) + (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e a) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_6() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b+c:d";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e (e b) + (e c)) : (e d)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_5() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a=b=c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) = (e (e b) = (e c))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b:c";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e b) : (e c)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a*b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) * (e b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_9() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b: c?d:e";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e b) : (e (e c) ? (e d) : (e e))) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_8() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a? b?c:d : e";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e (e b) ? (e c) : (e d)) : (e e)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTernaryExpr_7() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(258);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : e EOF ; // must indicate EOF can follow or 'a<EOF>' won't match\n");
		grammarBuilder.append("e : e '*' e\n");
		grammarBuilder.append("  | e '+' e\n");
		grammarBuilder.append("  |<assoc=right> e '?' e ':' e\n");
		grammarBuilder.append("  |<assoc=right> e '=' e\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a?b=c:d";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (e (e a) ? (e (e b) = (e c)) : (e d)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList1_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(300);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr (',' b+=expr)* '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr x) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList1_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(300);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr (',' b+=expr)* '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a*b,c,x*y>>r";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr (expr (expr a) * (expr b)) , (expr c) , (expr (expr x) * (expr y)) >> (expr r)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList2_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(317);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr ',' b+=expr #Comma\n");
		grammarBuilder.append("    | b+=expr '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append("	;\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a*b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr (expr a) * (expr b)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDirectCallToLeftRecursiveRule_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(119);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("a @after {print($ctx.toStringTree(recog=self))} : a ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "a", input, false);

		assertEquals("(a x)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDirectCallToLeftRecursiveRule_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(119);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("a @after {print($ctx.toStringTree(recog=self))} : a ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "a", input, false);

		assertEquals("(a (a x) y)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testDirectCallToLeftRecursiveRule_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(119);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("a @after {print($ctx.toStringTree(recog=self))} : a ID\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x y z";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "a", input, false);

		assertEquals("(a (a (a x) y) z)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPrefixOpWithActionAndLabel_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(329);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.result)} ;\n");
		grammarBuilder.append("e returns [String result]\n");
		grammarBuilder.append("    :   ID '=' e1=e    {$result = \"(\" + $ID.text + \"=\" + $e1.result + \")\";}\n");
		grammarBuilder.append("    |   ID             {$result = $ID.text;}\n");
		grammarBuilder.append("    |   e1=e '+' e2=e  {$result = \"(\" + $e1.result + \"+\" + $e2.result + \")\";}\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a+b";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(a+b)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPrefixOpWithActionAndLabel_1() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(329);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s : e {print($e.result)} ;\n");
		grammarBuilder.append("e returns [String result]\n");
		grammarBuilder.append("    :   ID '=' e1=e    {$result = \"(\" + $ID.text + \"=\" + $e1.result + \")\";}\n");
		grammarBuilder.append("    |   ID             {$result = $ID.text;}\n");
		grammarBuilder.append("    |   e1=e '+' e2=e  {$result = \"(\" + $e1.result + \"+\" + $e2.result + \")\";}\n");
		grammarBuilder.append("    ;\n");
		grammarBuilder.append("ID : 'a'..'z'+ ;\n");
		grammarBuilder.append("INT : '0'..'9'+ ;\n");
		grammarBuilder.append("WS : (' '|'\\n') -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("a\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList2_2() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(317);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr ',' b+=expr #Comma\n");
		grammarBuilder.append("    | b+=expr '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append("	;\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a,c>>x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr (expr (expr a) , (expr c)) >> (expr x)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList2_3() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(317);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr ',' b+=expr #Comma\n");
		grammarBuilder.append("    | b+=expr '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append("	;\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="x";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr x) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testReturnValueAndActionsList2_4() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(317);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("s @after {print($ctx.toStringTree(recog=self))} : expr EOF;\n");
		grammarBuilder.append("expr:\n");
		grammarBuilder.append("    a=expr '*' a=expr #Factor\n");
		grammarBuilder.append("    | b+=expr ',' b+=expr #Comma\n");
		grammarBuilder.append("    | b+=expr '>>' c=expr #Send\n");
		grammarBuilder.append("    | ID #JustId //semantic check on modifiers\n");
		grammarBuilder.append("	;\n");
		grammarBuilder.append("ID  : ('a'..'z'|'A'..'Z'|'_')\n");
		grammarBuilder.append("      ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*\n");
		grammarBuilder.append(";\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();


		String input ="a*b,c,x*y>>r";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "s", input, false);

		assertEquals("(s (expr (expr (expr (expr (expr a) * (expr b)) , (expr c)) , (expr (expr x) * (expr y))) >> (expr r)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testPrecedenceFilterConsidersContext() throws Exception {
		mkdir(tmpdir);

		StringBuilder grammarBuilder = new StringBuilder(142);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("prog \n");
		grammarBuilder.append("@after {print($ctx.toStringTree(recog=self))}\n");
		grammarBuilder.append(": statement* EOF {};\n");
		grammarBuilder.append("statement: letterA | statement letterA 'b' ;\n");
		grammarBuilder.append("letterA: 'a';");
		String grammar = grammarBuilder.toString();


		String input ="aa";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "TListener", "TVisitor", "prog", input, false);

		assertEquals("(prog (statement (letterA a)) (statement (letterA a)) <EOF>)\n", found);
		assertNull(this.stderrDuringParse);

	}


}
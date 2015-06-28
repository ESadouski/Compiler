// Generated from /home/litvin/IdeaProjects/ANTLR/gen/generated/Test.g4 by ANTLR 4.5

    import main.handle.GrammaHandler;
    import main.handle.SadouskiParser;
    import main.model.*;
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, MATH_SYMB=34, STRING=35, INT=36, WORD=37, WS=38, SYMB=39;
	public static final int
		RULE_program = 0, RULE_variable = 1, RULE_type = 2, RULE_name = 3, RULE_value = 4, 
		RULE_expression = 5, RULE_relation = 6, RULE_statement = 7, RULE_ifstatement = 8, 
		RULE_whilestatement = 9, RULE_forstatement = 10, RULE_procedure = 11, 
		RULE_function = 12, RULE_function_call = 13, RULE_parameters = 14, RULE_parameter = 15, 
		RULE_print = 16;
	public static final String[] ruleNames = {
		"program", "variable", "type", "name", "value", "expression", "relation", 
		"statement", "ifstatement", "whilestatement", "forstatement", "procedure", 
		"function", "function_call", "parameters", "parameter", "print"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'start'", "'finish'", "' = '", "', '", "';'", "'node'", 
		"'doc'", "'attr'", "'int'", "'string'", "'\"'", "'=='", "'!='", "'<'", 
		"'<='", "'>='", "'>'", "'if'", "'('", "')'", "'else'", "'endif'", "'while'", 
		"'endwhile'", "'for'", "'endfor'", "'procedure'", "'end'", "'function'", 
		"'return'", "','", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "MATH_SYMB", 
		"STRING", "INT", "WORD", "WS", "SYMB"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private GrammaHandler handler = new GrammaHandler();
	    private SadouskiParser parser = new SadouskiParser();
	    
	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			match(T__0);
			parser.prepareFiles();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(36); 
				match(WS);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); 
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); 
					match(WS);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(56);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(49); 
						variable();
						}
						break;
					case 2:
						{
						setState(50); 
						expression();
						}
						break;
					case 3:
						{
						setState(51); 
						statement();
						}
						break;
					case 4:
						{
						setState(52); 
						function();
						}
						break;
					case 5:
						{
						setState(53); 
						procedure();
						}
						break;
					case 6:
						{
						setState(54); 
						function_call();
						}
						break;
					case 7:
						{
						setState(55); 
						print();
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(61); 
				match(WS);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); 
			match(T__2);
			parser.closeFiles();
			handler.test();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TypeContext type;
		public NameContext name;
		public ValueContext value;
		public ExpressionContext expression;
		public Function_callContext function_call;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			((VariableContext)_localctx).type = type();
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72); 
				match(WS);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(77); 
			((VariableContext)_localctx).name = name();
			handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope));
			setState(80);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(79); 
				match(T__3);
				}
			}

			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82); 
				((VariableContext)_localctx).value = value();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).value.val);
				}
				break;
			case 2:
				{
				setState(85); 
				((VariableContext)_localctx).expression = expression();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).expression.val);
				}
				break;
			case 3:
				{
				setState(88); 
				((VariableContext)_localctx).function_call = function_call();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).function_call.val);
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(93); 
				match(T__4);
				setState(94); 
				((VariableContext)_localctx).name = name();
				handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope));
				setState(97);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(96); 
					match(T__3);
					}
				}

				setState(108);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(99); 
					((VariableContext)_localctx).value = value();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).value.val);
					}
					break;
				case 2:
					{
					setState(102); 
					((VariableContext)_localctx).expression = expression();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).expression.val);
					}
					break;
				case 3:
					{
					setState(105); 
					((VariableContext)_localctx).function_call = function_call();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null)).setValue(((VariableContext)_localctx).function_call.val);
					}
					break;
				}
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(115); 
				match(WS);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); 
			match(T__5);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122); 
					match(WS);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			parser.writeVariables(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TestParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String val;
		public Token STRING;
		public Token INT;
		public TerminalNode STRING() { return getToken(TestParser.STRING, 0); }
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(134); 
				match(T__11);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(135); 
					match(WS);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141); 
				((ValueContext)_localctx).STRING = match(STRING);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(142); 
					match(WS);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148); 
				match(T__11);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null);
				}
				break;
			case INT:
				{
				setState(150); 
				((ValueContext)_localctx).INT = match(INT);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).INT!=null?((ValueContext)_localctx).INT.getText():null);
				}
				break;
			case STRING:
				{
				setState(152); 
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String val;
		public ValueContext s1;
		public Token MATH_SYMB;
		public ValueContext s2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<TerminalNode> MATH_SYMB() { return getTokens(TestParser.MATH_SYMB); }
		public TerminalNode MATH_SYMB(int i) {
			return getToken(TestParser.MATH_SYMB, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(156); 
				match(WS);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); 
			((ExpressionContext)_localctx).s1 = value();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163); 
					match(WS);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			((ExpressionContext)_localctx).val =  (((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATH_SYMB) {
				{
				{
				setState(170); 
				((ExpressionContext)_localctx).MATH_SYMB = match(MATH_SYMB);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171); 
						match(WS);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177); 
						((ExpressionContext)_localctx).s2 = value();
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183); 
						match(WS);
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				if ((((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null)!=null) {
				                                         ((ExpressionContext)_localctx).val =  _localctx.val + " " + (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null) + " " + (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null);
				                                         } else {((ExpressionContext)_localctx).val =  _localctx.val + " " + (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null);
				                                         }
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public String strValF;
		public String strValS;
		public String typeOfValue;
		public String sign;
		public ValueContext v1;
		public ValueContext v2;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(195); 
				match(WS);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201); 
			((RelationContext)_localctx).v1 = value();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202); 
					match(WS);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(220);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(208); 
					match(T__12);
					((RelationContext)_localctx).sign = "==";
					}
					break;
				case T__13:
					{
					setState(210); 
					match(T__13);
					((RelationContext)_localctx).sign = "!=";
					}
					break;
				case T__14:
					{
					setState(212); 
					match(T__14);
					((RelationContext)_localctx).sign = "<";
					}
					break;
				case T__15:
					{
					setState(214); 
					match(T__15);
					((RelationContext)_localctx).sign = "<=";
					}
					break;
				case T__16:
					{
					setState(216); 
					match(T__16);
					((RelationContext)_localctx).sign = ">=";
					}
					break;
				case T__17:
					{
					setState(218); 
					match(T__17);
					((RelationContext)_localctx).sign = ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(222); 
					match(WS);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228); 
				((RelationContext)_localctx).v2 = value();
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229); 
						match(WS);
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				((RelationContext)_localctx).strValF =  ((RelationContext)_localctx).v1.val; ((RelationContext)_localctx).strValS =  ((RelationContext)_localctx).v2.val;
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); 
				ifstatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); 
				whilestatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); 
				forstatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			match(T__18);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(248); 
				match(WS);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254); 
			match(T__19);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255); 
					match(WS);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(261); 
			((IfstatementContext)_localctx).relation = relation();
			parser.makeRelationHeader(((IfstatementContext)_localctx).relation.strValF, ((IfstatementContext)_localctx).relation.strValS, "if", handler.scope);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(263); 
				match(WS);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); 
			match(T__20);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270); 
					match(WS);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(290);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(276); 
						variable();
						}
						break;
					case 2:
						{
						setState(277); 
						((IfstatementContext)_localctx).expression = expression();
						setState(281);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(278); 
								match(WS);
								}
								} 
							}
							setState(283);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(284); 
						function_call();
						}
						break;
					case 4:
						{
						setState(285); 
						statement();
						}
						break;
					case 5:
						{
						setState(286); 
						print();
						setState(287); 
						match(T__5);
						parser.makeRelationBody(((IfstatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); 
					match(WS);
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(328);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(301); 
						match(T__21);
						setState(305);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(302); 
							match(WS);
							}
							}
							setState(307);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(308); 
						variable();
						}
						break;
					case 2:
						{
						setState(309); 
						((IfstatementContext)_localctx).expression = expression();
						setState(313);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(310); 
								match(WS);
								}
								} 
							}
							setState(315);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(316); 
						function_call();
						}
						break;
					case 4:
						{
						setState(317); 
						statement();
						}
						break;
					case 5:
						{
						setState(318); 
						print();
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(319); 
							match(WS);
							}
							}
							setState(324);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(325); 
						match(T__5);
						parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).expression.val + " }", handler.scope);
						}
						break;
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(333); 
				match(WS);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339); 
			match(T__22);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340); 
					match(WS);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilestatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			match(T__23);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(347); 
				match(WS);
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353); 
			match(T__19);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354); 
					match(WS);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(360); 
			((WhilestatementContext)_localctx).relation = relation();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(361); 
				match(WS);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			parser.makeRelationHeader(((WhilestatementContext)_localctx).relation.strValF, ((WhilestatementContext)_localctx).relation.strValS, "while", handler.scope);
			setState(368); 
			match(T__20);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369); 
					match(WS);
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(401);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(378);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(375); 
							match(WS);
							}
							}
							setState(380);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(381); 
						variable();
						}
						break;
					case 2:
						{
						setState(382); 
						((WhilestatementContext)_localctx).expression = expression();
						setState(386);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(383); 
								match(WS);
								}
								} 
							}
							setState(388);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(389); 
						function_call();
						}
						break;
					case 4:
						{
						setState(390); 
						statement();
						}
						break;
					case 5:
						{
						setState(391); 
						print();
						setState(395);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(392); 
							match(WS);
							}
							}
							setState(397);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(398); 
						match(T__5);
						parser.makeRelationBody(((WhilestatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(406); 
				match(WS);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412); 
			match(T__24);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413); 
					match(WS);
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			parser.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forstatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421); 
			match(T__25);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(422); 
				match(WS);
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428); 
			match(T__19);
			parser.makeLoopHeader(handler.scope);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(430); 
				match(WS);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436); 
			variable();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(437); 
				match(WS);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443); 
			match(T__5);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(444); 
					match(WS);
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(450); 
			((ForstatementContext)_localctx).relation = relation();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(451); 
				match(WS);
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457); 
			match(T__5);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458); 
					match(WS);
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(464); 
			((ForstatementContext)_localctx).expression = expression();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(465); 
				match(WS);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471); 
			match(T__20);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472); 
					match(WS);
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			parser.makeLoopHeaderParams(((ForstatementContext)_localctx).relation.strValF, ((ForstatementContext)_localctx).relation.sign, ((ForstatementContext)_localctx).relation.strValS, ((ForstatementContext)_localctx).expression.val, handler.scope);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(505);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(482);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(479); 
							match(WS);
							}
							}
							setState(484);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(485); 
						variable();
						}
						break;
					case 2:
						{
						setState(486); 
						((ForstatementContext)_localctx).expression = expression();
						setState(490);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(487); 
								match(WS);
								}
								} 
							}
							setState(492);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(493); 
						function_call();
						}
						break;
					case 4:
						{
						setState(494); 
						statement();
						}
						break;
					case 5:
						{
						setState(495); 
						print();
						setState(499);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS) {
							{
							{
							setState(496); 
							match(WS);
							}
							}
							setState(501);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(502); 
						match(T__5);
						parser.makeRelationBody(((ForstatementContext)_localctx).expression.val, handler.scope);
						}
						break;
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(510); 
				match(WS);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516); 
			match(T__26);
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(517); 
					match(WS);
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			parser.closeRelation(handler.scope);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public NameContext name;
		public ParametersContext parameters;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525); 
			match(T__27);
			setState(527); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(526); 
				match(WS);
				}
				}
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(531); 
			((ProcedureContext)_localctx).name = name();
			handler.scope = (((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(533); 
				match(WS);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539); 
			match(T__19);
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(540); 
					match(WS);
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(547);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << STRING))) != 0)) {
				{
				setState(546); 
				((ProcedureContext)_localctx).parameters = parameters();
				}
			}

			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(549); 
				match(WS);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555); 
			match(T__20);
			parser.makeProcedureHeader((((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null), ((ProcedureContext)_localctx).parameters.val);
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557); 
					match(WS);
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(574);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(563); 
						variable();
						}
						break;
					case 2:
						{
						setState(564); 
						expression();
						setState(568);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(565); 
								match(WS);
								}
								} 
							}
							setState(570);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(571); 
						function_call();
						}
						break;
					case 4:
						{
						setState(572); 
						statement();
						}
						break;
					case 5:
						{
						setState(573); 
						print();
						}
						break;
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(579); 
				match(WS);
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585); 
			match(T__28);
			parser.closeProcedure();
			handler.scope = "global";
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588); 
					match(WS);
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public String val;
		public TypeContext type;
		public NameContext name;
		public ParametersContext parameters;
		public ExpressionContext expression;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594); 
			match(T__29);
			setState(596); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(595); 
				match(WS);
				}
				}
				setState(598); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(600); 
			((FunctionContext)_localctx).type = type();
			setState(602); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(601); 
				match(WS);
				}
				}
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS );
			setState(606); 
			((FunctionContext)_localctx).name = name();
			handler.scope = (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(608); 
				match(WS);
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614); 
			match(T__19);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(615); 
					match(WS);
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(622);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << STRING))) != 0)) {
				{
				setState(621); 
				((FunctionContext)_localctx).parameters = parameters();
				}
			}

			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(624); 
				match(WS);
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630); 
			match(T__20);
			parser.makeFuncHeader((((FunctionContext)_localctx).type!=null?_input.getText(((FunctionContext)_localctx).type.start,((FunctionContext)_localctx).type.stop):null) + " " + (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null), ((FunctionContext)_localctx).parameters.val);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(632); 
					match(WS);
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(649);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(638); 
						variable();
						}
						break;
					case 2:
						{
						setState(639); 
						((FunctionContext)_localctx).expression = expression();
						setState(643);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(640); 
								match(WS);
								}
								} 
							}
							setState(645);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(646); 
						function_call();
						}
						break;
					case 4:
						{
						setState(647); 
						statement();
						}
						break;
					case 5:
						{
						setState(648); 
						print();
						}
						break;
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(654); 
				match(WS);
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660); 
			match(T__30);
			setState(662); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(661); 
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(664); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(666); 
			((FunctionContext)_localctx).expression = expression();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(667); 
				match(WS);
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673); 
			match(T__5);
			parser.closeFunc(((FunctionContext)_localctx).expression.val);
			handler.scope = "global";
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676); 
					match(WS);
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public String val;
		public NameContext name;
		public ParametersContext parameters;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682); 
			((Function_callContext)_localctx).name = name();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(683); 
				match(WS);
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689); 
			match(T__19);
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(690); 
					match(WS);
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(697);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << STRING))) != 0)) {
				{
				setState(696); 
				((Function_callContext)_localctx).parameters = parameters();
				}
			}

			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(699); 
				match(WS);
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705); 
			match(T__20);
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(706); 
				match(WS);
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712); 
			match(T__5);
			parser.makeFuncCall((((Function_callContext)_localctx).name!=null?_input.getText(((Function_callContext)_localctx).name.start,((Function_callContext)_localctx).name.stop):null), ((Function_callContext)_localctx).parameters.val);
			                                             ((Function_callContext)_localctx).val = (((Function_callContext)_localctx).name!=null?_input.getText(((Function_callContext)_localctx).name.start,((Function_callContext)_localctx).name.stop):null) + " (" +  ((Function_callContext)_localctx).parameters.val + ")";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public String val;
		public ParameterContext p1;
		public ParameterContext p2;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715); 
			((ParametersContext)_localctx).p1 = parameter();
			((ParametersContext)_localctx).val =  ((ParametersContext)_localctx).p1.val;
			{
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(717); 
				match(WS);
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723); 
			match(T__31);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(724); 
				match(WS);
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(730); 
			((ParametersContext)_localctx).p2 = parameter();
			((ParametersContext)_localctx).val =  _localctx.val + ","+ ((ParametersContext)_localctx).p2.val;
			setState(735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(732); 
					match(WS);
					}
					} 
				}
				setState(737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public String val;
		public TypeContext type;
		public NameContext name;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(738); 
				((ParameterContext)_localctx).type = type();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(739); 
					match(WS);
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).type!=null?_input.getText(((ParameterContext)_localctx).type.start,((ParameterContext)_localctx).type.stop):null) + " ";
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752); 
			((ParameterContext)_localctx).name = name();
			 if(_localctx.val ==null) {
			    	                                                                  ((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).name!=null?_input.getText(((ParameterContext)_localctx).name.start,((ParameterContext)_localctx).name.stop):null);
			    	                                                                  } else ((ParameterContext)_localctx).val =  _localctx.val + (((ParameterContext)_localctx).name!=null?_input.getText(((ParameterContext)_localctx).name.start,((ParameterContext)_localctx).name.stop):null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TestParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TestParser.WS, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestVisitor ) return ((TestVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(755); 
			match(T__32);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(756); 
				match(WS);
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762); 
			match(T__19);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(763); 
					match(WS);
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(769); 
			((PrintContext)_localctx).expression = expression();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(770); 
				match(WS);
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776); 
			match(T__20);
			parser.print(handler.scope, ((PrintContext)_localctx).expression.val);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u030e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n\2\f\2"+
		"\16\2D\13\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3L\n\3\r\3\16\3M\3\3\3\3\3\3\5\3"+
		"S\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\3\3\3\3\3\3\3\5\3"+
		"d\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\7\3q\n\3\f\3\16\3t"+
		"\13\3\3\3\7\3w\n\3\f\3\16\3z\13\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6"+
		"\3\6\7\6\u0092\n\6\f\6\16\6\u0095\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009d"+
		"\n\6\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\7\3\7\7\7\u00a7\n\7\f\7\16"+
		"\7\u00aa\13\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\7\7\7\u00b5"+
		"\n\7\f\7\16\7\u00b8\13\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\7\7\7"+
		"\u00c1\n\7\f\7\16\7\u00c4\13\7\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3"+
		"\b\3\b\7\b\u00ce\n\b\f\b\16\b\u00d1\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00df\n\b\3\b\7\b\u00e2\n\b\f\b\16\b\u00e5\13\b"+
		"\3\b\3\b\7\b\u00e9\n\b\f\b\16\b\u00ec\13\b\3\b\3\b\7\b\u00f0\n\b\f\b\16"+
		"\b\u00f3\13\b\3\t\3\t\3\t\5\t\u00f8\n\t\3\n\3\n\7\n\u00fc\n\n\f\n\16\n"+
		"\u00ff\13\n\3\n\3\n\7\n\u0103\n\n\f\n\16\n\u0106\13\n\3\n\3\n\3\n\7\n"+
		"\u010b\n\n\f\n\16\n\u010e\13\n\3\n\3\n\7\n\u0112\n\n\f\n\16\n\u0115\13"+
		"\n\3\n\3\n\3\n\7\n\u011a\n\n\f\n\16\n\u011d\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u0125\n\n\f\n\16\n\u0128\13\n\3\n\7\n\u012b\n\n\f\n\16\n\u012e"+
		"\13\n\3\n\3\n\7\n\u0132\n\n\f\n\16\n\u0135\13\n\3\n\3\n\3\n\7\n\u013a"+
		"\n\n\f\n\16\n\u013d\13\n\3\n\3\n\3\n\3\n\7\n\u0143\n\n\f\n\16\n\u0146"+
		"\13\n\3\n\3\n\3\n\7\n\u014b\n\n\f\n\16\n\u014e\13\n\3\n\7\n\u0151\n\n"+
		"\f\n\16\n\u0154\13\n\3\n\3\n\7\n\u0158\n\n\f\n\16\n\u015b\13\n\3\13\3"+
		"\13\7\13\u015f\n\13\f\13\16\13\u0162\13\13\3\13\3\13\7\13\u0166\n\13\f"+
		"\13\16\13\u0169\13\13\3\13\3\13\7\13\u016d\n\13\f\13\16\13\u0170\13\13"+
		"\3\13\3\13\3\13\7\13\u0175\n\13\f\13\16\13\u0178\13\13\3\13\7\13\u017b"+
		"\n\13\f\13\16\13\u017e\13\13\3\13\3\13\3\13\7\13\u0183\n\13\f\13\16\13"+
		"\u0186\13\13\3\13\3\13\3\13\3\13\7\13\u018c\n\13\f\13\16\13\u018f\13\13"+
		"\3\13\3\13\3\13\7\13\u0194\n\13\f\13\16\13\u0197\13\13\3\13\7\13\u019a"+
		"\n\13\f\13\16\13\u019d\13\13\3\13\3\13\7\13\u01a1\n\13\f\13\16\13\u01a4"+
		"\13\13\3\13\3\13\3\f\3\f\7\f\u01aa\n\f\f\f\16\f\u01ad\13\f\3\f\3\f\3\f"+
		"\7\f\u01b2\n\f\f\f\16\f\u01b5\13\f\3\f\3\f\7\f\u01b9\n\f\f\f\16\f\u01bc"+
		"\13\f\3\f\3\f\7\f\u01c0\n\f\f\f\16\f\u01c3\13\f\3\f\3\f\7\f\u01c7\n\f"+
		"\f\f\16\f\u01ca\13\f\3\f\3\f\7\f\u01ce\n\f\f\f\16\f\u01d1\13\f\3\f\3\f"+
		"\7\f\u01d5\n\f\f\f\16\f\u01d8\13\f\3\f\3\f\7\f\u01dc\n\f\f\f\16\f\u01df"+
		"\13\f\3\f\3\f\7\f\u01e3\n\f\f\f\16\f\u01e6\13\f\3\f\3\f\3\f\7\f\u01eb"+
		"\n\f\f\f\16\f\u01ee\13\f\3\f\3\f\3\f\3\f\7\f\u01f4\n\f\f\f\16\f\u01f7"+
		"\13\f\3\f\3\f\3\f\7\f\u01fc\n\f\f\f\16\f\u01ff\13\f\3\f\7\f\u0202\n\f"+
		"\f\f\16\f\u0205\13\f\3\f\3\f\7\f\u0209\n\f\f\f\16\f\u020c\13\f\3\f\3\f"+
		"\3\r\3\r\6\r\u0212\n\r\r\r\16\r\u0213\3\r\3\r\3\r\7\r\u0219\n\r\f\r\16"+
		"\r\u021c\13\r\3\r\3\r\7\r\u0220\n\r\f\r\16\r\u0223\13\r\3\r\5\r\u0226"+
		"\n\r\3\r\7\r\u0229\n\r\f\r\16\r\u022c\13\r\3\r\3\r\3\r\7\r\u0231\n\r\f"+
		"\r\16\r\u0234\13\r\3\r\3\r\3\r\7\r\u0239\n\r\f\r\16\r\u023c\13\r\3\r\3"+
		"\r\3\r\7\r\u0241\n\r\f\r\16\r\u0244\13\r\3\r\7\r\u0247\n\r\f\r\16\r\u024a"+
		"\13\r\3\r\3\r\3\r\3\r\7\r\u0250\n\r\f\r\16\r\u0253\13\r\3\16\3\16\6\16"+
		"\u0257\n\16\r\16\16\16\u0258\3\16\3\16\6\16\u025d\n\16\r\16\16\16\u025e"+
		"\3\16\3\16\3\16\7\16\u0264\n\16\f\16\16\16\u0267\13\16\3\16\3\16\7\16"+
		"\u026b\n\16\f\16\16\16\u026e\13\16\3\16\5\16\u0271\n\16\3\16\7\16\u0274"+
		"\n\16\f\16\16\16\u0277\13\16\3\16\3\16\3\16\7\16\u027c\n\16\f\16\16\16"+
		"\u027f\13\16\3\16\3\16\3\16\7\16\u0284\n\16\f\16\16\16\u0287\13\16\3\16"+
		"\3\16\3\16\7\16\u028c\n\16\f\16\16\16\u028f\13\16\3\16\7\16\u0292\n\16"+
		"\f\16\16\16\u0295\13\16\3\16\3\16\6\16\u0299\n\16\r\16\16\16\u029a\3\16"+
		"\3\16\7\16\u029f\n\16\f\16\16\16\u02a2\13\16\3\16\3\16\3\16\3\16\7\16"+
		"\u02a8\n\16\f\16\16\16\u02ab\13\16\3\17\3\17\7\17\u02af\n\17\f\17\16\17"+
		"\u02b2\13\17\3\17\3\17\7\17\u02b6\n\17\f\17\16\17\u02b9\13\17\3\17\5\17"+
		"\u02bc\n\17\3\17\7\17\u02bf\n\17\f\17\16\17\u02c2\13\17\3\17\3\17\7\17"+
		"\u02c6\n\17\f\17\16\17\u02c9\13\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20"+
		"\u02d1\n\20\f\20\16\20\u02d4\13\20\3\20\3\20\7\20\u02d8\n\20\f\20\16\20"+
		"\u02db\13\20\3\20\3\20\3\20\7\20\u02e0\n\20\f\20\16\20\u02e3\13\20\3\21"+
		"\3\21\7\21\u02e7\n\21\f\21\16\21\u02ea\13\21\3\21\3\21\7\21\u02ee\n\21"+
		"\f\21\16\21\u02f1\13\21\3\21\3\21\3\21\3\22\3\22\7\22\u02f8\n\22\f\22"+
		"\16\22\u02fb\13\22\3\22\3\22\7\22\u02ff\n\22\f\22\16\22\u0302\13\22\3"+
		"\22\3\22\7\22\u0306\n\22\f\22\16\22\u0309\13\22\3\22\3\22\3\22\3\22\2"+
		"\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\t\r\u0389\2$\3"+
		"\2\2\2\4I\3\2\2\2\6\u0084\3\2\2\2\b\u0086\3\2\2\2\n\u009c\3\2\2\2\f\u00a1"+
		"\3\2\2\2\16\u00c8\3\2\2\2\20\u00f7\3\2\2\2\22\u00f9\3\2\2\2\24\u015c\3"+
		"\2\2\2\26\u01a7\3\2\2\2\30\u020f\3\2\2\2\32\u0254\3\2\2\2\34\u02ac\3\2"+
		"\2\2\36\u02cd\3\2\2\2 \u02ef\3\2\2\2\"\u02f5\3\2\2\2$%\7\3\2\2%)\b\2\1"+
		"\2&(\7(\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2"+
		"\2\2,\60\7\4\2\2-/\7(\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61<\3\2\2\2\62\60\3\2\2\2\63;\5\4\3\2\64;\5\f\7\2\65;\5\20\t\2\66"+
		";\5\32\16\2\67;\5\30\r\28;\5\34\17\29;\5\"\22\2:\63\3\2\2\2:\64\3\2\2"+
		"\2:\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<"+
		":\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\7(\2\2@?\3\2\2\2AD\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\5\2\2FG\b\2\1\2GH\b\2\1\2"+
		"H\3\3\2\2\2IK\5\6\4\2JL\7(\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NO\3\2\2\2OP\5\b\5\2PR\b\3\1\2QS\7\6\2\2RQ\3\2\2\2RS\3\2\2\2S]\3\2\2\2"+
		"TU\5\n\6\2UV\b\3\1\2V^\3\2\2\2WX\5\f\7\2XY\b\3\1\2Y^\3\2\2\2Z[\5\34\17"+
		"\2[\\\b\3\1\2\\^\3\2\2\2]T\3\2\2\2]W\3\2\2\2]Z\3\2\2\2]^\3\2\2\2^r\3\2"+
		"\2\2_`\7\7\2\2`a\5\b\5\2ac\b\3\1\2bd\7\6\2\2cb\3\2\2\2cd\3\2\2\2dn\3\2"+
		"\2\2ef\5\n\6\2fg\b\3\1\2go\3\2\2\2hi\5\f\7\2ij\b\3\1\2jo\3\2\2\2kl\5\34"+
		"\17\2lm\b\3\1\2mo\3\2\2\2ne\3\2\2\2nh\3\2\2\2nk\3\2\2\2no\3\2\2\2oq\3"+
		"\2\2\2p_\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sx\3\2\2\2tr\3\2\2\2uw\7"+
		"(\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\177"+
		"\7\b\2\2|~\7(\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b\3\1\2\u0083\5"+
		"\3\2\2\2\u0084\u0085\t\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7%\2\2\u0087"+
		"\t\3\2\2\2\u0088\u008c\7\16\2\2\u0089\u008b\7(\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0093\7%\2\2\u0090\u0092\7(\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\16\2\2\u0097"+
		"\u009d\b\6\1\2\u0098\u0099\7&\2\2\u0099\u009d\b\6\1\2\u009a\u009b\7%\2"+
		"\2\u009b\u009d\b\6\1\2\u009c\u0088\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009d\13\3\2\2\2\u009e\u00a0\7(\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\5\n\6\2\u00a5\u00a7\7(\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00c2\b\7\1\2\u00ac"+
		"\u00b0\7$\2\2\u00ad\u00af\7(\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b5\5\n\6\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bb\7(\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c1\b\7\1\2\u00c0\u00ac\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\r\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c7\7(\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cf\5\n\6\2\u00cc\u00ce\7(\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00f1\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00df\b\b\1\2\u00d4\u00d5\7"+
		"\20\2\2\u00d5\u00df\b\b\1\2\u00d6\u00d7\7\21\2\2\u00d7\u00df\b\b\1\2\u00d8"+
		"\u00d9\7\22\2\2\u00d9\u00df\b\b\1\2\u00da\u00db\7\23\2\2\u00db\u00df\b"+
		"\b\1\2\u00dc\u00dd\7\24\2\2\u00dd\u00df\b\b\1\2\u00de\u00d2\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00da\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\7(\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\5\n\6\2\u00e7"+
		"\u00e9\7(\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\b\b\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00de\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\17\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f8\5\22\n\2\u00f5\u00f8\5\24\13\2\u00f6\u00f8\5\26\f"+
		"\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\21"+
		"\3\2\2\2\u00f9\u00fd\7\25\2\2\u00fa\u00fc\7(\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104\7\26\2\2\u0101\u0103\7(\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5\16\b\2\u0108"+
		"\u010c\b\n\1\2\u0109\u010b\7(\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0113\7\27\2\2\u0110\u0112\7(\2\2\u0111\u0110\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0126\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0125\5\4\3\2\u0117\u011b\5\f"+
		"\7\2\u0118\u011a\7(\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0125\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u0125\5\34\17\2\u011f\u0125\5\20\t\2\u0120\u0121\5\"\22\2\u0121"+
		"\u0122\7\b\2\2\u0122\u0123\b\n\1\2\u0123\u0125\3\2\2\2\u0124\u0116\3\2"+
		"\2\2\u0124\u0117\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u012c\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7(\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u014c\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133\7\30\2\2\u0130"+
		"\u0132\7(\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u014b\5\4\3\2\u0137\u013b\5\f\7\2\u0138\u013a\7(\2\2\u0139\u0138\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u014b\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u014b\5\34\17\2\u013f\u014b\5"+
		"\20\t\2\u0140\u0144\5\"\22\2\u0141\u0143\7(\2\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\b\2\2\u0148\u0149\b\n\1\2\u0149"+
		"\u014b\3\2\2\2\u014a\u012f\3\2\2\2\u014a\u0137\3\2\2\2\u014a\u013e\3\2"+
		"\2\2\u014a\u013f\3\2\2\2\u014a\u0140\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0151\7(\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0159\7\31\2\2\u0156\u0158\7(\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\23\3\2\2"+
		"\2\u015b\u0159\3\2\2\2\u015c\u0160\7\32\2\2\u015d\u015f\7(\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0167\7\26\2\2\u0164\u0166\7"+
		"(\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\5\16"+
		"\b\2\u016b\u016d\7(\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\b\13\1\2\u0172\u0176\7\27\2\2\u0173\u0175\7(\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0195\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017b\7(\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0194\5\4\3\2\u0180"+
		"\u0184\5\f\7\2\u0181\u0183\7(\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0194\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0194\5\34\17\2\u0188\u0194\5\20\t\2\u0189\u018d"+
		"\5\"\22\2\u018a\u018c\7(\2\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u0190\u0191\7\b\2\2\u0191\u0192\b\13\1\2\u0192\u0194\3\2\2\2\u0193"+
		"\u017c\3\2\2\2\u0193\u0180\3\2\2\2\u0193\u0187\3\2\2\2\u0193\u0188\3\2"+
		"\2\2\u0193\u0189\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u019b\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7("+
		"\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a2\7\33"+
		"\2\2\u019f\u01a1\7(\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a6\b\13\1\2\u01a6\25\3\2\2\2\u01a7\u01ab\7\34\2\2\u01a8"+
		"\u01aa\7(\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\7\26\2\2\u01af\u01b3\b\f\1\2\u01b0\u01b2\7(\2\2\u01b1\u01b0\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\5\4\3\2\u01b7\u01b9\7("+
		"\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c1\7\b"+
		"\2\2\u01be\u01c0\7(\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c4\u01c8\5\16\b\2\u01c5\u01c7\7(\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cf\7\b\2\2\u01cc\u01ce\7(\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d6\5\f\7\2\u01d3"+
		"\u01d5\7(\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01dd\7\27\2\2\u01da\u01dc\7(\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01fd\b\f\1\2\u01e1\u01e3\7(\2\2\u01e2\u01e1\3\2"+
		"\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01fc\5\4\3\2\u01e8\u01ec\5\f"+
		"\7\2\u01e9\u01eb\7(\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01fc\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ef\u01fc\5\34\17\2\u01f0\u01fc\5\20\t\2\u01f1\u01f5\5\"\22\2\u01f2"+
		"\u01f4\7(\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\7\b\2\2\u01f9\u01fa\b\f\1\2\u01fa\u01fc\3\2\2\2\u01fb\u01e4\3\2"+
		"\2\2\u01fb\u01e8\3\2\2\2\u01fb\u01ef\3\2\2\2\u01fb\u01f0\3\2\2\2\u01fb"+
		"\u01f1\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0203\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0202\7(\2\2\u0201"+
		"\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u020a\7\35\2\2\u0207"+
		"\u0209\7(\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d"+
		"\u020e\b\f\1\2\u020e\27\3\2\2\2\u020f\u0211\7\36\2\2\u0210\u0212\7(\2"+
		"\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5\b\5\2\u0216\u021a\b\r\1\2\u0217"+
		"\u0219\7(\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u0221\7\26\2\2\u021e\u0220\7(\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u0226\5\36\20\2\u0225\u0224\3\2\2\2\u0225\u0226\3"+
		"\2\2\2\u0226\u022a\3\2\2\2\u0227\u0229\7(\2\2\u0228\u0227\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2"+
		"\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\27\2\2\u022e\u0232\b\r\1\2\u022f"+
		"\u0231\7(\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0242\3\2\2\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0241\5\4\3\2\u0236\u023a\5\f\7\2\u0237\u0239\7(\2\2\u0238\u0237\3\2"+
		"\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u0241\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0241\5\34\17\2\u023e\u0241\5"+
		"\20\t\2\u023f\u0241\5\"\22\2\u0240\u0235\3\2\2\2\u0240\u0236\3\2\2\2\u0240"+
		"\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2"+
		"\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0248\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0247\7(\2\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024c\7\37\2\2\u024c\u024d\b\r\1\2\u024d\u0251\b"+
		"\r\1\2\u024e\u0250\7(\2\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\31\3\2\2\2\u0253\u0251\3\2\2"+
		"\2\u0254\u0256\7 \2\2\u0255\u0257\7(\2\2\u0256\u0255\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\5\6\4\2\u025b\u025d\7(\2\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0261\5\b\5\2\u0261\u0265\b\16\1\2\u0262\u0264\7(\2\2\u0263\u0262\3\2"+
		"\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026c\7\26\2\2\u0269\u026b\7"+
		"(\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271\5\36"+
		"\20\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0275\3\2\2\2\u0272"+
		"\u0274\7(\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2"+
		"\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278"+
		"\u0279\7\27\2\2\u0279\u027d\b\16\1\2\u027a\u027c\7(\2\2\u027b\u027a\3"+
		"\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u028d\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u028c\5\4\3\2\u0281\u0285\5\f"+
		"\7\2\u0282\u0284\7(\2\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028c\3\2\2\2\u0287\u0285\3\2"+
		"\2\2\u0288\u028c\5\34\17\2\u0289\u028c\5\20\t\2\u028a\u028c\5\"\22\2\u028b"+
		"\u0280\3\2\2\2\u028b\u0281\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0293\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\7("+
		"\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7!"+
		"\2\2\u0297\u0299\7(\2\2\u0298\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\5\f"+
		"\7\2\u029d\u029f\7(\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2"+
		"\2\2\u02a3\u02a4\7\b\2\2\u02a4\u02a5\b\16\1\2\u02a5\u02a9\b\16\1\2\u02a6"+
		"\u02a8\7(\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\33\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02b0"+
		"\5\b\5\2\u02ad\u02af\7(\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2"+
		"\2\2\u02b3\u02b7\7\26\2\2\u02b4\u02b6\7(\2\2\u02b5\u02b4\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bc\5\36\20\2\u02bb\u02ba\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02c0\3\2\2\2\u02bd\u02bf\7(\2\2\u02be\u02bd\3\2"+
		"\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c7\7\27\2\2\u02c4\u02c6\7"+
		"(\2\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7\b"+
		"\2\2\u02cb\u02cc\b\17\1\2\u02cc\35\3\2\2\2\u02cd\u02ce\5 \21\2\u02ce\u02d2"+
		"\b\20\1\2\u02cf\u02d1\7(\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2\3\2"+
		"\2\2\u02d5\u02d9\7\"\2\2\u02d6\u02d8\7(\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\5 \21\2\u02dd\u02e1\b\20\1\2\u02de"+
		"\u02e0\7(\2\2\u02df\u02de\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2"+
		"\2\2\u02e1\u02e2\3\2\2\2\u02e2\37\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e8"+
		"\5\6\4\2\u02e5\u02e7\7(\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02eb\u02ec\b\21\1\2\u02ec\u02ee\3\2\2\2\u02ed\u02e4\3\2\2\2\u02ee"+
		"\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3\2"+
		"\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\5\b\5\2\u02f3\u02f4\b\21\1\2\u02f4"+
		"!\3\2\2\2\u02f5\u02f9\7#\2\2\u02f6\u02f8\7(\2\2\u02f7\u02f6\3\2\2\2\u02f8"+
		"\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2"+
		"\2\2\u02fb\u02f9\3\2\2\2\u02fc\u0300\7\26\2\2\u02fd\u02ff\7(\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0307\5\f\7\2\u0304"+
		"\u0306\7(\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030b\7\27\2\2\u030b\u030c\b\22\1\2\u030c#\3\2\2\2n)\60:<BMR]cnrx\177"+
		"\u008c\u0093\u009c\u00a1\u00a8\u00b0\u00b6\u00bc\u00c2\u00c8\u00cf\u00de"+
		"\u00e3\u00ea\u00f1\u00f7\u00fd\u0104\u010c\u0113\u011b\u0124\u0126\u012c"+
		"\u0133\u013b\u0144\u014a\u014c\u0152\u0159\u0160\u0167\u016e\u0176\u017c"+
		"\u0184\u018d\u0193\u0195\u019b\u01a2\u01ab\u01b3\u01ba\u01c1\u01c8\u01cf"+
		"\u01d6\u01dd\u01e4\u01ec\u01f5\u01fb\u01fd\u0203\u020a\u0213\u021a\u0221"+
		"\u0225\u022a\u0232\u023a\u0240\u0242\u0248\u0251\u0258\u025e\u0265\u026c"+
		"\u0270\u0275\u027d\u0285\u028b\u028d\u0293\u029a\u02a0\u02a9\u02b0\u02b7"+
		"\u02bb\u02c0\u02c7\u02d2\u02d9\u02e1\u02e8\u02ef\u02f9\u0300\u0307";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
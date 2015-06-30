// Generated from /home/litvin/IdeaProjects/ANTLR/gen/generated/Test.g4 by ANTLR 4.5

    import main.handle.MemoryHandler;
    import main.handle.GrabParser;
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, MATH_SYMB=31, 
		STRING=32, INT=33, WORD=34, WS=35;
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
		null, "'program'", "'start'", "'finish'", "' = '", "', '", "';'", "'int'", 
		"'String'", "'\"'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'if'", 
		"'('", "')'", "'else'", "'endif'", "'while'", "'endwhile'", "'for'", "'endfor'", 
		"'procedure'", "'end'", "'function'", "'return'", "','", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MATH_SYMB", "STRING", "INT", 
		"WORD", "WS"
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


	    private MemoryHandler handler = new MemoryHandler();
	    private GrabParser parser = new GrabParser();
	    
	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			match(T__0);
			parser.prepareFiles();
			setState(36); 
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(44);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(37); 
					variable();
					}
					break;
				case 2:
					{
					setState(38); 
					expression();
					}
					break;
				case 3:
					{
					setState(39); 
					statement();
					}
					break;
				case 4:
					{
					setState(40); 
					function();
					}
					break;
				case 5:
					{
					setState(41); 
					procedure();
					}
					break;
				case 6:
					{
					setState(42); 
					function_call();
					}
					break;
				case 7:
					{
					setState(43); 
					print();
					}
					break;
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49); 
			match(T__2);
			parser.closeFiles();
			System.out.println("Generation completed");
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
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			((VariableContext)_localctx).type = type();
			setState(54); 
			((VariableContext)_localctx).name = name();
			handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope), handler.scope);
			setState(57);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(56); 
				match(T__3);
				}
			}

			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(59); 
				((VariableContext)_localctx).value = value();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), handler.scope).setValue(((VariableContext)_localctx).value.val);
				if ("Var".equals(((VariableContext)_localctx).value.typeOfVal)) {
				                          handler.getVarByName(((VariableContext)_localctx).value.val, handler.scope);
				                            }
				                          
				}
				break;
			case 2:
				{
				setState(63); 
				((VariableContext)_localctx).expression = expression();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), handler.scope).setValue(((VariableContext)_localctx).expression.val);
				}
				break;
			case 3:
				{
				setState(66); 
				((VariableContext)_localctx).function_call = function_call();
				handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), handler.scope).setValue(((VariableContext)_localctx).function_call.val);
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(71); 
				match(T__4);
				setState(72); 
				((VariableContext)_localctx).name = name();
				handler.addVar(new Variable((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), (((VariableContext)_localctx).type!=null?_input.getText(((VariableContext)_localctx).type.start,((VariableContext)_localctx).type.stop):null), handler.scope), handler.scope);
				setState(75);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(74); 
					match(T__3);
					}
				}

				setState(86);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(77); 
					((VariableContext)_localctx).value = value();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), handler.scope).setValue(((VariableContext)_localctx).value.val);
					}
					break;
				case 2:
					{
					setState(80); 
					((VariableContext)_localctx).expression = expression();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), handler.scope).setValue(((VariableContext)_localctx).expression.val);
					}
					break;
				case 3:
					{
					setState(83); 
					((VariableContext)_localctx).function_call = function_call();
					handler.getVarByName((((VariableContext)_localctx).name!=null?_input.getText(((VariableContext)_localctx).name.start,((VariableContext)_localctx).name.stop):null), handler.scope).setValue(((VariableContext)_localctx).function_call.val);
					}
					break;
				}
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); 
			match(T__5);
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
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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
			setState(98); 
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
		public String typeOfVal;
		public Token STRING;
		public Token INT;
		public TerminalNode STRING() { return getToken(TestParser.STRING, 0); }
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(100); 
				match(T__8);
				setState(101); 
				((ValueContext)_localctx).STRING = match(STRING);
				setState(102); 
				match(T__8);
				((ValueContext)_localctx).val =  "\"" + (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null) + "\""; ((ValueContext)_localctx).typeOfVal =  "String";
				}
				break;
			case INT:
				{
				setState(104); 
				((ValueContext)_localctx).INT = match(INT);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).INT!=null?((ValueContext)_localctx).INT.getText():null); ((ValueContext)_localctx).typeOfVal =  "Int";
				}
				break;
			case STRING:
				{
				setState(106); 
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).val =  (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null); ((ValueContext)_localctx).typeOfVal =  "Var";
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
			setState(110); 
			((ExpressionContext)_localctx).s1 = value();
			((ExpressionContext)_localctx).val =  (((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MATH_SYMB) {
				{
				{
				setState(112); 
				((ExpressionContext)_localctx).MATH_SYMB = match(MATH_SYMB);
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113); 
						((ExpressionContext)_localctx).s2 = value();
						}
						} 
					}
					setState(118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				if ((((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null)!=null) {
				                                         if (((ExpressionContext)_localctx).s1.typeOfVal.equals("String")){
				                                            ((ExpressionContext)_localctx).val =  _localctx.val + parser.getMathSign("String", (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null), _localctx.val, (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null));
				                                            } else {
				                                            ((ExpressionContext)_localctx).val =  _localctx.val + " " + parser.getMathSign("Int", (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null), _localctx.val, (((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null));
				                                            }

				                                         } else {((ExpressionContext)_localctx).val =  _localctx.val + " " + (((ExpressionContext)_localctx).MATH_SYMB!=null?((ExpressionContext)_localctx).MATH_SYMB.getText():null);
				                                         }
				}
				}
				setState(124);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			((RelationContext)_localctx).v1 = value();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(138);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(126); 
					match(T__9);
					((RelationContext)_localctx).sign = "==";
					}
					break;
				case T__10:
					{
					setState(128); 
					match(T__10);
					((RelationContext)_localctx).sign = "!=";
					}
					break;
				case T__11:
					{
					setState(130); 
					match(T__11);
					((RelationContext)_localctx).sign = "<";
					}
					break;
				case T__12:
					{
					setState(132); 
					match(T__12);
					((RelationContext)_localctx).sign = "<=";
					}
					break;
				case T__13:
					{
					setState(134); 
					match(T__13);
					((RelationContext)_localctx).sign = ">=";
					}
					break;
				case T__14:
					{
					setState(136); 
					match(T__14);
					((RelationContext)_localctx).sign = ">";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140); 
				((RelationContext)_localctx).v2 = value();
				((RelationContext)_localctx).strValF =  ((RelationContext)_localctx).v1.val; ((RelationContext)_localctx).strValS =  ((RelationContext)_localctx).v2.val;
				}
				}
				setState(147);
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
			setState(151);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); 
				ifstatement();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); 
				whilestatement();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); 
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
		public Function_callContext function_call;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
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
			setState(153); 
			match(T__15);
			setState(154); 
			match(T__16);
			setState(155); 
			((IfstatementContext)_localctx).relation = relation();
			parser.makeRelationHeader(((IfstatementContext)_localctx).relation.strValF, ((IfstatementContext)_localctx).relation.strValS, "if", handler.scope);
			setState(157); 
			match(T__17);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(169);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(158); 
						variable();
						}
						break;
					case 2:
						{
						setState(159); 
						((IfstatementContext)_localctx).expression = expression();
						parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).expression.val + " }", handler.scope);
						}
						break;
					case 3:
						{
						setState(162); 
						((IfstatementContext)_localctx).function_call = function_call();
						parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).function_call.val + " }", handler.scope);
						}
						break;
					case 4:
						{
						setState(165); 
						statement();
						}
						break;
					case 5:
						{
						setState(166); 
						print();
						setState(167); 
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__29) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(186);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(174); 
					match(T__18);
					setState(175); 
					variable();
					}
					break;
				case 2:
					{
					setState(176); 
					((IfstatementContext)_localctx).expression = expression();
					parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).expression.val + " }", handler.scope);
					}
					break;
				case 3:
					{
					setState(179); 
					((IfstatementContext)_localctx).function_call = function_call();
					parser.makeRelationBody(" } else {" + ((IfstatementContext)_localctx).function_call.val + " }", handler.scope);
					}
					break;
				case 4:
					{
					setState(182); 
					statement();
					}
					break;
				case 5:
					{
					setState(183); 
					print();
					setState(184); 
					match(T__5);
					}
					break;
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191); 
			match(T__19);
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

	public static class WhilestatementContext extends ParserRuleContext {
		public RelationContext relation;
		public ExpressionContext expression;
		public Function_callContext function_call;
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			match(T__20);
			setState(195); 
			match(T__16);
			setState(196); 
			((WhilestatementContext)_localctx).relation = relation();
			parser.makeRelationHeader(((WhilestatementContext)_localctx).relation.strValF, ((WhilestatementContext)_localctx).relation.strValS, "while", handler.scope);
			setState(198); 
			match(T__17);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__29) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(210);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(199); 
					variable();
					}
					break;
				case 2:
					{
					setState(200); 
					((WhilestatementContext)_localctx).expression = expression();
					parser.makeRelationBody(" } else {" + ((WhilestatementContext)_localctx).expression.val + " }", handler.scope);
					}
					break;
				case 3:
					{
					setState(203); 
					((WhilestatementContext)_localctx).function_call = function_call();
					parser.makeRelationBody(" } else {" + ((WhilestatementContext)_localctx).function_call.val + " }", handler.scope);
					}
					break;
				case 4:
					{
					setState(206); 
					statement();
					}
					break;
				case 5:
					{
					setState(207); 
					print();
					setState(208); 
					match(T__5);
					}
					break;
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215); 
			match(T__21);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			match(T__22);
			setState(219); 
			match(T__16);
			parser.makeLoopHeader(handler.scope);
			setState(221); 
			variable();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(222); 
				match(T__5);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228); 
			((ForstatementContext)_localctx).relation = relation();
			setState(229); 
			match(T__5);
			setState(230); 
			((ForstatementContext)_localctx).expression = expression();
			setState(231); 
			match(T__17);
			parser.makeLoopHeaderParams(((ForstatementContext)_localctx).relation.strValF, ((ForstatementContext)_localctx).relation.sign, ((ForstatementContext)_localctx).relation.strValS, ((ForstatementContext)_localctx).expression.val, handler.scope);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__29) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(242);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(233); 
					variable();
					}
					break;
				case 2:
					{
					setState(234); 
					((ForstatementContext)_localctx).expression = expression();
					parser.makeRelationBody(((ForstatementContext)_localctx).expression.val, handler.scope);
					}
					break;
				case 3:
					{
					setState(237); 
					function_call();
					}
					break;
				case 4:
					{
					setState(238); 
					statement();
					}
					break;
				case 5:
					{
					setState(239); 
					print();
					setState(240); 
					match(T__5);
					}
					break;
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247); 
			match(T__23);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(250); 
			match(T__24);
			setState(251); 
			((ProcedureContext)_localctx).name = name();
			handler.scope = (((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null);
			setState(253); 
			match(T__16);
			setState(255);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(254); 
				((ProcedureContext)_localctx).parameters = parameters();
				}
			}

			setState(257); 
			match(T__17);
			parser.makeProcedureHeader((((ProcedureContext)_localctx).name!=null?_input.getText(((ProcedureContext)_localctx).name.start,((ProcedureContext)_localctx).name.stop):null), ((ProcedureContext)_localctx).parameters.val);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__29) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(264);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(259); 
					variable();
					}
					break;
				case 2:
					{
					setState(260); 
					expression();
					}
					break;
				case 3:
					{
					setState(261); 
					function_call();
					}
					break;
				case 4:
					{
					setState(262); 
					statement();
					}
					break;
				case 5:
					{
					setState(263); 
					print();
					}
					break;
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); 
			match(T__25);
			parser.closeProcedure();
			handler.scope = "global";
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
			enterOuterAlt(_localctx, 1);
			{
			setState(273); 
			match(T__26);
			setState(274); 
			((FunctionContext)_localctx).type = type();
			setState(275); 
			((FunctionContext)_localctx).name = name();
			handler.scope = (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null);
			setState(277); 
			match(T__16);
			setState(279);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(278); 
				((FunctionContext)_localctx).parameters = parameters();
				}
			}

			setState(281); 
			match(T__17);
			parser.makeFuncHeader((((FunctionContext)_localctx).type!=null?_input.getText(((FunctionContext)_localctx).type.start,((FunctionContext)_localctx).type.stop):null) + " " + (((FunctionContext)_localctx).name!=null?_input.getText(((FunctionContext)_localctx).name.start,((FunctionContext)_localctx).name.stop):null), ((FunctionContext)_localctx).parameters.val);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__29) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				setState(288);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(283); 
					variable();
					}
					break;
				case 2:
					{
					setState(284); 
					((FunctionContext)_localctx).expression = expression();
					}
					break;
				case 3:
					{
					setState(285); 
					function_call();
					}
					break;
				case 4:
					{
					setState(286); 
					statement();
					}
					break;
				case 5:
					{
					setState(287); 
					print();
					}
					break;
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293); 
			match(T__27);
			setState(294); 
			((FunctionContext)_localctx).expression = expression();
			setState(295); 
			match(T__5);
			parser.closeFunc(((FunctionContext)_localctx).expression.val);
			handler.scope = "global";
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
			setState(299); 
			((Function_callContext)_localctx).name = name();
			setState(300); 
			match(T__16);
			setState(302);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << STRING))) != 0)) {
				{
				setState(301); 
				((Function_callContext)_localctx).parameters = parameters();
				}
			}

			setState(304); 
			match(T__17);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305); 
					match(T__5);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			parser.makeFuncCall((((Function_callContext)_localctx).name!=null?_input.getText(((Function_callContext)_localctx).name.start,((Function_callContext)_localctx).name.stop):null), ((Function_callContext)_localctx).parameters.val, handler.scope);
			                                             ((Function_callContext)_localctx).val = (((Function_callContext)_localctx).name!=null?_input.getText(((Function_callContext)_localctx).name.start,((Function_callContext)_localctx).name.stop):null) + " (" +  ((Function_callContext)_localctx).parameters.val + ");";
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
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			((ParametersContext)_localctx).p1 = parameter();
			((ParametersContext)_localctx).val =  ((ParametersContext)_localctx).p1.val;
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(315); 
				match(T__28);
				setState(316); 
				((ParametersContext)_localctx).p2 = parameter();
				((ParametersContext)_localctx).val =  _localctx.val + ","+ ((ParametersContext)_localctx).p2.val;
				}
				}
				setState(323);
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
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(324); 
				((ParameterContext)_localctx).type = type();
				((ParameterContext)_localctx).val =  (((ParameterContext)_localctx).type!=null?_input.getText(((ParameterContext)_localctx).type.start,((ParameterContext)_localctx).type.stop):null) + " ";
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332); 
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335); 
			match(T__29);
			setState(336); 
			match(T__16);
			setState(337); 
			((PrintContext)_localctx).expression = expression();
			setState(338); 
			match(T__17);
			parser.print(handler.scope, ((PrintContext)_localctx).expression.val);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340); 
					match(T__5);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u015d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3Y\n\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\7\3\7\7\7u\n\7\f\7"+
		"\16\7x\13\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16"+
		"\b\u0095\13\b\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16\n\u00af\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n"+
		"\u00c0\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d5\n\13\f\13\16\13\u00d8\13"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f\u00e5\13"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f5\n"+
		"\f\f\f\16\f\u00f8\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010b\n\r\f\r\16\r\u010e\13\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011a\n\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126\13\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0131\n\17\3\17\3\17\7\17\u0135"+
		"\n\17\f\17\16\17\u0138\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u0142\n\20\f\20\16\20\u0145\13\20\3\21\3\21\3\21\7\21\u014a\n\21\f"+
		"\21\16\21\u014d\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0158\n\22\f\22\16\22\u015b\13\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\3\3\2\t\n\u018d\2$\3\2\2\2\4\67\3\2\2\2\6b\3\2\2"+
		"\2\bd\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16\177\3\2\2\2\20\u0099\3\2\2\2\22"+
		"\u009b\3\2\2\2\24\u00c4\3\2\2\2\26\u00dc\3\2\2\2\30\u00fc\3\2\2\2\32\u0113"+
		"\3\2\2\2\34\u012d\3\2\2\2\36\u013b\3\2\2\2 \u014b\3\2\2\2\"\u0151\3\2"+
		"\2\2$%\7\3\2\2%&\b\2\1\2&\60\7\4\2\2\'/\5\4\3\2(/\5\f\7\2)/\5\20\t\2*"+
		"/\5\32\16\2+/\5\30\r\2,/\5\34\17\2-/\5\"\22\2.\'\3\2\2\2.(\3\2\2\2.)\3"+
		"\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\5\2\2\64\65\b\2\1\2"+
		"\65\66\b\2\1\2\66\3\3\2\2\2\678\5\6\4\289\5\b\5\29;\b\3\1\2:<\7\6\2\2"+
		";:\3\2\2\2;<\3\2\2\2<G\3\2\2\2=>\5\n\6\2>?\b\3\1\2?@\b\3\1\2@H\3\2\2\2"+
		"AB\5\f\7\2BC\b\3\1\2CH\3\2\2\2DE\5\34\17\2EF\b\3\1\2FH\3\2\2\2G=\3\2\2"+
		"\2GA\3\2\2\2GD\3\2\2\2GH\3\2\2\2H\\\3\2\2\2IJ\7\7\2\2JK\5\b\5\2KM\b\3"+
		"\1\2LN\7\6\2\2ML\3\2\2\2MN\3\2\2\2NX\3\2\2\2OP\5\n\6\2PQ\b\3\1\2QY\3\2"+
		"\2\2RS\5\f\7\2ST\b\3\1\2TY\3\2\2\2UV\5\34\17\2VW\b\3\1\2WY\3\2\2\2XO\3"+
		"\2\2\2XR\3\2\2\2XU\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZI\3\2\2\2[^\3\2\2\2\\Z"+
		"\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\b\2\2`a\b\3\1\2a\5\3\2\2"+
		"\2bc\t\2\2\2c\7\3\2\2\2de\7\"\2\2e\t\3\2\2\2fg\7\13\2\2gh\7\"\2\2hi\7"+
		"\13\2\2io\b\6\1\2jk\7#\2\2ko\b\6\1\2lm\7\"\2\2mo\b\6\1\2nf\3\2\2\2nj\3"+
		"\2\2\2nl\3\2\2\2o\13\3\2\2\2pq\5\n\6\2q|\b\7\1\2rv\7!\2\2su\5\n\6\2ts"+
		"\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y{\b\7\1\2z"+
		"r\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\r\3\2\2\2~|\3\2\2\2\177\u0093"+
		"\5\n\6\2\u0080\u0081\7\f\2\2\u0081\u008d\b\b\1\2\u0082\u0083\7\r\2\2\u0083"+
		"\u008d\b\b\1\2\u0084\u0085\7\16\2\2\u0085\u008d\b\b\1\2\u0086\u0087\7"+
		"\17\2\2\u0087\u008d\b\b\1\2\u0088\u0089\7\20\2\2\u0089\u008d\b\b\1\2\u008a"+
		"\u008b\7\21\2\2\u008b\u008d\b\b\1\2\u008c\u0080\3\2\2\2\u008c\u0082\3"+
		"\2\2\2\u008c\u0084\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\n\6\2\u008f\u0090\b\b"+
		"\1\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\17\3\2\2\2\u0095\u0093\3\2\2"+
		"\2\u0096\u009a\5\22\n\2\u0097\u009a\5\24\13\2\u0098\u009a\5\26\f\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\21\3\2\2"+
		"\2\u009b\u009c\7\22\2\2\u009c\u009d\7\23\2\2\u009d\u009e\5\16\b\2\u009e"+
		"\u009f\b\n\1\2\u009f\u00ad\7\24\2\2\u00a0\u00ac\5\4\3\2\u00a1\u00a2\5"+
		"\f\7\2\u00a2\u00a3\b\n\1\2\u00a3\u00ac\3\2\2\2\u00a4\u00a5\5\34\17\2\u00a5"+
		"\u00a6\b\n\1\2\u00a6\u00ac\3\2\2\2\u00a7\u00ac\5\20\t\2\u00a8\u00a9\5"+
		"\"\22\2\u00a9\u00aa\7\b\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab"+
		"\u00a1\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00be\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00bd\5"+
		"\4\3\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\b\n\1\2\u00b4\u00bd\3\2\2\2\u00b5"+
		"\u00b6\5\34\17\2\u00b6\u00b7\b\n\1\2\u00b7\u00bd\3\2\2\2\u00b8\u00bd\5"+
		"\20\t\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb\7\b\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b0\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\26"+
		"\2\2\u00c2\u00c3\b\n\1\2\u00c3\23\3\2\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00c6"+
		"\7\23\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\b\13\1\2\u00c8\u00d6\7\24\2"+
		"\2\u00c9\u00d5\5\4\3\2\u00ca\u00cb\5\f\7\2\u00cb\u00cc\b\13\1\2\u00cc"+
		"\u00d5\3\2\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\b\13\1\2\u00cf\u00d5"+
		"\3\2\2\2\u00d0\u00d5\5\20\t\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7\b\2\2"+
		"\u00d3\u00d5\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cd"+
		"\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\7\30\2\2\u00da\u00db\b\13\1\2\u00db\25\3\2\2\2\u00dc"+
		"\u00dd\7\31\2\2\u00dd\u00de\7\23\2\2\u00de\u00df\b\f\1\2\u00df\u00e3\5"+
		"\4\3\2\u00e0\u00e2\7\b\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\5\16\b\2\u00e7\u00e8\7\b\2\2\u00e8\u00e9\5\f\7\2\u00e9"+
		"\u00ea\7\24\2\2\u00ea\u00f6\b\f\1\2\u00eb\u00f5\5\4\3\2\u00ec\u00ed\5"+
		"\f\7\2\u00ed\u00ee\b\f\1\2\u00ee\u00f5\3\2\2\2\u00ef\u00f5\5\34\17\2\u00f0"+
		"\u00f5\5\20\t\2\u00f1\u00f2\5\"\22\2\u00f2\u00f3\7\b\2\2\u00f3\u00f5\3"+
		"\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7\32\2\2\u00fa\u00fb\b\f\1\2\u00fb\27\3\2\2\2\u00fc\u00fd\7\33"+
		"\2\2\u00fd\u00fe\5\b\5\2\u00fe\u00ff\b\r\1\2\u00ff\u0101\7\23\2\2\u0100"+
		"\u0102\5\36\20\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0104\7\24\2\2\u0104\u010c\b\r\1\2\u0105\u010b\5\4\3\2\u0106"+
		"\u010b\5\f\7\2\u0107\u010b\5\34\17\2\u0108\u010b\5\20\t\2\u0109\u010b"+
		"\5\"\22\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\7\34\2\2\u0110\u0111\b\r\1\2\u0111\u0112\b\r\1\2\u0112\31\3\2\2"+
		"\2\u0113\u0114\7\35\2\2\u0114\u0115\5\6\4\2\u0115\u0116\5\b\5\2\u0116"+
		"\u0117\b\16\1\2\u0117\u0119\7\23\2\2\u0118\u011a\5\36\20\2\u0119\u0118"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\24\2\2"+
		"\u011c\u0124\b\16\1\2\u011d\u0123\5\4\3\2\u011e\u0123\5\f\7\2\u011f\u0123"+
		"\5\34\17\2\u0120\u0123\5\20\t\2\u0121\u0123\5\"\22\2\u0122\u011d\3\2\2"+
		"\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\36\2\2\u0128\u0129\5"+
		"\f\7\2\u0129\u012a\7\b\2\2\u012a\u012b\b\16\1\2\u012b\u012c\b\16\1\2\u012c"+
		"\33\3\2\2\2\u012d\u012e\5\b\5\2\u012e\u0130\7\23\2\2\u012f\u0131\5\36"+
		"\20\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0136\7\24\2\2\u0133\u0135\7\b\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\b\17\1\2\u013a\35\3\2\2\2\u013b\u013c\5 \21"+
		"\2\u013c\u0143\b\20\1\2\u013d\u013e\7\37\2\2\u013e\u013f\5 \21\2\u013f"+
		"\u0140\b\20\1\2\u0140\u0142\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\37\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\5\6\4\2\u0147\u0148\b\21\1\2\u0148\u014a\3"+
		"\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\5\b"+
		"\5\2\u014f\u0150\b\21\1\2\u0150!\3\2\2\2\u0151\u0152\7 \2\2\u0152\u0153"+
		"\7\23\2\2\u0153\u0154\5\f\7\2\u0154\u0155\7\24\2\2\u0155\u0159\b\22\1"+
		"\2\u0156\u0158\7\b\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a#\3\2\2\2\u015b\u0159\3\2\2\2#.\60;"+
		"GMX\\nv|\u008c\u0093\u0099\u00ab\u00ad\u00bc\u00be\u00d4\u00d6\u00e3\u00f4"+
		"\u00f6\u0101\u010a\u010c\u0119\u0122\u0124\u0130\u0136\u0143\u014b\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
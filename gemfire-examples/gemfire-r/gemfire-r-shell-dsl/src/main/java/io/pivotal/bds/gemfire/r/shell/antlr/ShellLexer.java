// Generated from io/pivotal/bds/gemfire/r/shell/antlr/Shell.g4 by ANTLR 4.5.2
package io.pivotal.bds.gemfire.r.shell.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShellLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PMML_LOAD=1, PMML_PREDICT=2, CBIND=3, RBIND=4, NROWS=5, NCOLS=6, T=7, 
		M=8, C=9, HMM=10, GAUSSIANKERNEL=11, LAPLACEKERNEL=12, LINEARKERNEL=13, 
		PEARSONKERNEL=14, POLYNOMIALKERNEL=15, HYPERBOLICTANGENTKERNEL=16, THINPLATEPLINEKERNEL=17, 
		HELLINGERKERNEL=18, SPARSEGAUSSIANKERNEL=19, SPARSELAPLACEKERNEL=20, SPARSELINEARKERNEL=21, 
		SPARSEPOLYNOMIALKERNEL=22, SPARSEHYPERBOLICTANGENTKERNEL=23, SPARSETHINPLATEPLINEKERNEL=24, 
		BINARYSPARSEGAUSSIANKERNEL=25, BINARYSPARSELAPLACEKERNEL=26, BINARYSPARSELINEARKERNEL=27, 
		BINARYSPARSEPOLYNOMIALKERNEL=28, BINARYSPARSEHYPERBOLICTANGENTKERNEL=29, 
		BINARYSPARSETHINPLATEPLINEKERNEL=30, RBF_NETWORK=31, RANDOMFOREST_CLASSIFICATION=32, 
		FLD=33, QDA=34, LDA=35, RDA=36, LOGISTIC_REGRESSION=37, NAIVE_BAYES=38, 
		NEUTRAL_NETWORK=39, KNN=40, DECISIONTREE_CLASSIFICATIONERROR=41, DECISIONTREE=42, 
		GAUSSIANPROCESS=43, REGRESSIONTREE=44, RANDOMFORESTREGRESSION=45, RIDGEREGRESSION=46, 
		SVR=47, ENTROPY=48, GINI=49, DTRAIN=50, TRAIN=51, FFT=52, FORWARD=53, 
		INVERSE=54, STANDARD=55, UNITARY=56, MATRIX=57, VECTOR=58, QUERYARGS=59, 
		MODEL=60, FIELDS=61, REGION=62, RM=63, LS=64, PRINT=65, PREDICT=66, K=67, 
		LAMBDA=68, SVM=69, CP=70, CN=71, QUERY=72, EXECUTE=73, LBRACKET=74, RBRACKET=75, 
		LPAREN=76, RPAREN=77, LBRACE=78, RBRACE=79, DBLQUOTES=80, COMMA=81, EQUALS=82, 
		IDENTIFIER=83, DIGIT=84, NUMBER=85, QUOTEDSTRING=86, WS=87;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PMML_LOAD", "PMML_PREDICT", "CBIND", "RBIND", "NROWS", "NCOLS", "T", 
		"M", "C", "HMM", "GAUSSIANKERNEL", "LAPLACEKERNEL", "LINEARKERNEL", "PEARSONKERNEL", 
		"POLYNOMIALKERNEL", "HYPERBOLICTANGENTKERNEL", "THINPLATEPLINEKERNEL", 
		"HELLINGERKERNEL", "SPARSEGAUSSIANKERNEL", "SPARSELAPLACEKERNEL", "SPARSELINEARKERNEL", 
		"SPARSEPOLYNOMIALKERNEL", "SPARSEHYPERBOLICTANGENTKERNEL", "SPARSETHINPLATEPLINEKERNEL", 
		"BINARYSPARSEGAUSSIANKERNEL", "BINARYSPARSELAPLACEKERNEL", "BINARYSPARSELINEARKERNEL", 
		"BINARYSPARSEPOLYNOMIALKERNEL", "BINARYSPARSEHYPERBOLICTANGENTKERNEL", 
		"BINARYSPARSETHINPLATEPLINEKERNEL", "RBF_NETWORK", "RANDOMFOREST_CLASSIFICATION", 
		"FLD", "QDA", "LDA", "RDA", "LOGISTIC_REGRESSION", "NAIVE_BAYES", "NEUTRAL_NETWORK", 
		"KNN", "DECISIONTREE_CLASSIFICATIONERROR", "DECISIONTREE", "GAUSSIANPROCESS", 
		"REGRESSIONTREE", "RANDOMFORESTREGRESSION", "RIDGEREGRESSION", "SVR", 
		"ENTROPY", "GINI", "DTRAIN", "TRAIN", "FFT", "FORWARD", "INVERSE", "STANDARD", 
		"UNITARY", "MATRIX", "VECTOR", "QUERYARGS", "MODEL", "FIELDS", "REGION", 
		"RM", "LS", "PRINT", "PREDICT", "K", "LAMBDA", "SVM", "CP", "CN", "QUERY", 
		"EXECUTE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"DBLQUOTES", "COMMA", "EQUALS", "IDENTIFIER", "DIGIT", "NUMBER", "QUOTEDSTRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pmml.load'", "'pmml.predict'", "'cbind'", "'rbind'", "'nrows'", 
		"'ncols'", "'t'", "'m'", "'c'", "'hmm'", "'gausskernel'", "'laplacekernel'", 
		"'linearkernel'", "'pearsonkernel'", "'polykernel'", "'hypertangentkernel'", 
		"'thinplatesplinekernel'", "'hellingerkernel'", "'sparsegausskernel'", 
		"'sparselaplacekernel'", "'sparselinearkernel'", "'sparsepolykernel'", 
		"'sparsehypertangentkernel'", "'sparsethinplatesplinekernel'", "'binarysparsegausskernel'", 
		"'binarysparselaplacekernel'", "'binarysparselinearkernel'", "'binarysparsepolykernel'", 
		"'binarysparsehypertangentkernel'", "'binarysparsethinplatesplinekernel'", 
		"'rbfnet'", "'rforestc'", "'fld'", "'qda'", "'lda'", "'rda'", "'lregress'", 
		"'nbayes'", "'neuralnet'", "'knn'", "'classerror'", "'dtree'", "'gp'", 
		"'rtree'", "'rforestr'", "'ridger'", "'svr'", "'entropy'", "'gini'", "'dtrain'", 
		"'train'", "'fft'", "'forward'", "'inverse'", "'standard'", "'unitary'", 
		"'matrix'", "'vect'", "'queryArgs'", "'model'", "'fields'", "'region'", 
		"'rm'", "'ls'", "'print'", "'predict'", "'k'", "'lambda'", "'svm'", "'cp'", 
		"'cn'", "'query'", "'execute'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
		"'\"'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PMML_LOAD", "PMML_PREDICT", "CBIND", "RBIND", "NROWS", "NCOLS", 
		"T", "M", "C", "HMM", "GAUSSIANKERNEL", "LAPLACEKERNEL", "LINEARKERNEL", 
		"PEARSONKERNEL", "POLYNOMIALKERNEL", "HYPERBOLICTANGENTKERNEL", "THINPLATEPLINEKERNEL", 
		"HELLINGERKERNEL", "SPARSEGAUSSIANKERNEL", "SPARSELAPLACEKERNEL", "SPARSELINEARKERNEL", 
		"SPARSEPOLYNOMIALKERNEL", "SPARSEHYPERBOLICTANGENTKERNEL", "SPARSETHINPLATEPLINEKERNEL", 
		"BINARYSPARSEGAUSSIANKERNEL", "BINARYSPARSELAPLACEKERNEL", "BINARYSPARSELINEARKERNEL", 
		"BINARYSPARSEPOLYNOMIALKERNEL", "BINARYSPARSEHYPERBOLICTANGENTKERNEL", 
		"BINARYSPARSETHINPLATEPLINEKERNEL", "RBF_NETWORK", "RANDOMFOREST_CLASSIFICATION", 
		"FLD", "QDA", "LDA", "RDA", "LOGISTIC_REGRESSION", "NAIVE_BAYES", "NEUTRAL_NETWORK", 
		"KNN", "DECISIONTREE_CLASSIFICATIONERROR", "DECISIONTREE", "GAUSSIANPROCESS", 
		"REGRESSIONTREE", "RANDOMFORESTREGRESSION", "RIDGEREGRESSION", "SVR", 
		"ENTROPY", "GINI", "DTRAIN", "TRAIN", "FFT", "FORWARD", "INVERSE", "STANDARD", 
		"UNITARY", "MATRIX", "VECTOR", "QUERYARGS", "MODEL", "FIELDS", "REGION", 
		"RM", "LS", "PRINT", "PREDICT", "K", "LAMBDA", "SVM", "CP", "CN", "QUERY", 
		"EXECUTE", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"DBLQUOTES", "COMMA", "EQUALS", "IDENTIFIER", "DIGIT", "NUMBER", "QUOTEDSTRING", 
		"WS"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ShellLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2Y\u03c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3B"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G"+
		"\3G\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M"+
		"\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\7T\u03a4\nT\fT\16T\u03a7"+
		"\13T\3U\3U\3V\6V\u03ac\nV\rV\16V\u03ad\3V\3V\6V\u03b2\nV\rV\16V\u03b3"+
		"\5V\u03b6\nV\3W\3W\6W\u03ba\nW\rW\16W\u03bb\3W\3W\3X\6X\u03c1\nX\rX\16"+
		"X\u03c2\3X\3X\3\u03bb\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00af"+
		"Y\3\2\7\4\2C\\c|\7\2\60\60\62;C\\aac|\3\2\62;\3\2$$\5\2\13\f\16\17\"\""+
		"\u03cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\3\u00b1\3\2\2\2\5\u00bb\3\2\2\2\7\u00c8\3\2\2\2\t\u00ce\3\2\2\2\13"+
		"\u00d4\3\2\2\2\r\u00da\3\2\2\2\17\u00e0\3\2\2\2\21\u00e2\3\2\2\2\23\u00e4"+
		"\3\2\2\2\25\u00e6\3\2\2\2\27\u00ea\3\2\2\2\31\u00f6\3\2\2\2\33\u0104\3"+
		"\2\2\2\35\u0111\3\2\2\2\37\u011f\3\2\2\2!\u012a\3\2\2\2#\u013d\3\2\2\2"+
		"%\u0153\3\2\2\2\'\u0163\3\2\2\2)\u0175\3\2\2\2+\u0189\3\2\2\2-\u019c\3"+
		"\2\2\2/\u01ad\3\2\2\2\61\u01c6\3\2\2\2\63\u01e2\3\2\2\2\65\u01fa\3\2\2"+
		"\2\67\u0214\3\2\2\29\u022d\3\2\2\2;\u0244\3\2\2\2=\u0263\3\2\2\2?\u0285"+
		"\3\2\2\2A\u028c\3\2\2\2C\u0295\3\2\2\2E\u0299\3\2\2\2G\u029d\3\2\2\2I"+
		"\u02a1\3\2\2\2K\u02a5\3\2\2\2M\u02ae\3\2\2\2O\u02b5\3\2\2\2Q\u02bf\3\2"+
		"\2\2S\u02c3\3\2\2\2U\u02ce\3\2\2\2W\u02d4\3\2\2\2Y\u02d7\3\2\2\2[\u02dd"+
		"\3\2\2\2]\u02e6\3\2\2\2_\u02ed\3\2\2\2a\u02f1\3\2\2\2c\u02f9\3\2\2\2e"+
		"\u02fe\3\2\2\2g\u0305\3\2\2\2i\u030b\3\2\2\2k\u030f\3\2\2\2m\u0317\3\2"+
		"\2\2o\u031f\3\2\2\2q\u0328\3\2\2\2s\u0330\3\2\2\2u\u0337\3\2\2\2w\u033c"+
		"\3\2\2\2y\u0346\3\2\2\2{\u034c\3\2\2\2}\u0353\3\2\2\2\177\u035a\3\2\2"+
		"\2\u0081\u035d\3\2\2\2\u0083\u0360\3\2\2\2\u0085\u0366\3\2\2\2\u0087\u036e"+
		"\3\2\2\2\u0089\u0370\3\2\2\2\u008b\u0377\3\2\2\2\u008d\u037b\3\2\2\2\u008f"+
		"\u037e\3\2\2\2\u0091\u0381\3\2\2\2\u0093\u0387\3\2\2\2\u0095\u038f\3\2"+
		"\2\2\u0097\u0391\3\2\2\2\u0099\u0393\3\2\2\2\u009b\u0395\3\2\2\2\u009d"+
		"\u0397\3\2\2\2\u009f\u0399\3\2\2\2\u00a1\u039b\3\2\2\2\u00a3\u039d\3\2"+
		"\2\2\u00a5\u039f\3\2\2\2\u00a7\u03a1\3\2\2\2\u00a9\u03a8\3\2\2\2\u00ab"+
		"\u03ab\3\2\2\2\u00ad\u03b7\3\2\2\2\u00af\u03c0\3\2\2\2\u00b1\u00b2\7r"+
		"\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7\60\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7f\2\2\u00ba\4\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7o\2\2\u00bd"+
		"\u00be\7o\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\7r\2"+
		"\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7v\2\2\u00c7\6\3\2\2\2\u00c8\u00c9"+
		"\7e\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc"+
		"\u00cd\7f\2\2\u00cd\b\3\2\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7d\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3\n\3\2\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7y\2\2"+
		"\u00d8\u00d9\7u\2\2\u00d9\f\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7e"+
		"\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7u\2\2\u00df\16"+
		"\3\2\2\2\u00e0\u00e1\7v\2\2\u00e1\20\3\2\2\2\u00e2\u00e3\7o\2\2\u00e3"+
		"\22\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5\24\3\2\2\2\u00e6\u00e7\7j\2\2\u00e7"+
		"\u00e8\7o\2\2\u00e8\u00e9\7o\2\2\u00e9\26\3\2\2\2\u00ea\u00eb\7i\2\2\u00eb"+
		"\u00ec\7c\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7u\2\2"+
		"\u00ef\u00f0\7m\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7n\2\2\u00f5\30\3\2\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fa\7n\2\2\u00fa"+
		"\u00fb\7c\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7m\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7n\2\2\u0103\32\3\2\2\2\u0104\u0105\7n\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7g\2\2\u0108\u0109\7c\2\2\u0109"+
		"\u010a\7t\2\2\u010a\u010b\7m\2\2\u010b\u010c\7g\2\2\u010c\u010d\7t\2\2"+
		"\u010d\u010e\7p\2\2\u010e\u010f\7g\2\2\u010f\u0110\7n\2\2\u0110\34\3\2"+
		"\2\2\u0111\u0112\7r\2\2\u0112\u0113\7g\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7t\2\2\u0115\u0116\7u\2\2\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118"+
		"\u0119\7m\2\2\u0119\u011a\7g\2\2\u011a\u011b\7t\2\2\u011b\u011c\7p\2\2"+
		"\u011c\u011d\7g\2\2\u011d\u011e\7n\2\2\u011e\36\3\2\2\2\u011f\u0120\7"+
		"r\2\2\u0120\u0121\7q\2\2\u0121\u0122\7n\2\2\u0122\u0123\7{\2\2\u0123\u0124"+
		"\7m\2\2\u0124\u0125\7g\2\2\u0125\u0126\7t\2\2\u0126\u0127\7p\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7n\2\2\u0129 \3\2\2\2\u012a\u012b\7j\2\2\u012b"+
		"\u012c\7{\2\2\u012c\u012d\7r\2\2\u012d\u012e\7g\2\2\u012e\u012f\7t\2\2"+
		"\u012f\u0130\7v\2\2\u0130\u0131\7c\2\2\u0131\u0132\7p\2\2\u0132\u0133"+
		"\7i\2\2\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2\u0136"+
		"\u0137\7m\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139\u013a\7p\2\2"+
		"\u013a\u013b\7g\2\2\u013b\u013c\7n\2\2\u013c\"\3\2\2\2\u013d\u013e\7v"+
		"\2\2\u013e\u013f\7j\2\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142"+
		"\7r\2\2\u0142\u0143\7n\2\2\u0143\u0144\7c\2\2\u0144\u0145\7v\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7u\2\2\u0147\u0148\7r\2\2\u0148\u0149\7n\2\2"+
		"\u0149\u014a\7k\2\2\u014a\u014b\7p\2\2\u014b\u014c\7g\2\2\u014c\u014d"+
		"\7m\2\2\u014d\u014e\7g\2\2\u014e\u014f\7t\2\2\u014f\u0150\7p\2\2\u0150"+
		"\u0151\7g\2\2\u0151\u0152\7n\2\2\u0152$\3\2\2\2\u0153\u0154\7j\2\2\u0154"+
		"\u0155\7g\2\2\u0155\u0156\7n\2\2\u0156\u0157\7n\2\2\u0157\u0158\7k\2\2"+
		"\u0158\u0159\7p\2\2\u0159\u015a\7i\2\2\u015a\u015b\7g\2\2\u015b\u015c"+
		"\7t\2\2\u015c\u015d\7m\2\2\u015d\u015e\7g\2\2\u015e\u015f\7t\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7g\2\2\u0161\u0162\7n\2\2\u0162&\3\2\2\2\u0163"+
		"\u0164\7u\2\2\u0164\u0165\7r\2\2\u0165\u0166\7c\2\2\u0166\u0167\7t\2\2"+
		"\u0167\u0168\7u\2\2\u0168\u0169\7g\2\2\u0169\u016a\7i\2\2\u016a\u016b"+
		"\7c\2\2\u016b\u016c\7w\2\2\u016c\u016d\7u\2\2\u016d\u016e\7u\2\2\u016e"+
		"\u016f\7m\2\2\u016f\u0170\7g\2\2\u0170\u0171\7t\2\2\u0171\u0172\7p\2\2"+
		"\u0172\u0173\7g\2\2\u0173\u0174\7n\2\2\u0174(\3\2\2\2\u0175\u0176\7u\2"+
		"\2\u0176\u0177\7r\2\2\u0177\u0178\7c\2\2\u0178\u0179\7t\2\2\u0179\u017a"+
		"\7u\2\2\u017a\u017b\7g\2\2\u017b\u017c\7n\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7r\2\2\u017e\u017f\7n\2\2\u017f\u0180\7c\2\2\u0180\u0181\7e\2\2"+
		"\u0181\u0182\7g\2\2\u0182\u0183\7m\2\2\u0183\u0184\7g\2\2\u0184\u0185"+
		"\7t\2\2\u0185\u0186\7p\2\2\u0186\u0187\7g\2\2\u0187\u0188\7n\2\2\u0188"+
		"*\3\2\2\2\u0189\u018a\7u\2\2\u018a\u018b\7r\2\2\u018b\u018c\7c\2\2\u018c"+
		"\u018d\7t\2\2\u018d\u018e\7u\2\2\u018e\u018f\7g\2\2\u018f\u0190\7n\2\2"+
		"\u0190\u0191\7k\2\2\u0191\u0192\7p\2\2\u0192\u0193\7g\2\2\u0193\u0194"+
		"\7c\2\2\u0194\u0195\7t\2\2\u0195\u0196\7m\2\2\u0196\u0197\7g\2\2\u0197"+
		"\u0198\7t\2\2\u0198\u0199\7p\2\2\u0199\u019a\7g\2\2\u019a\u019b\7n\2\2"+
		"\u019b,\3\2\2\2\u019c\u019d\7u\2\2\u019d\u019e\7r\2\2\u019e\u019f\7c\2"+
		"\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7u\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3"+
		"\7r\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7{\2\2\u01a6"+
		"\u01a7\7m\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7t\2\2\u01a9\u01aa\7p\2\2"+
		"\u01aa\u01ab\7g\2\2\u01ab\u01ac\7n\2\2\u01ac.\3\2\2\2\u01ad\u01ae\7u\2"+
		"\2\u01ae\u01af\7r\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2"+
		"\7u\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7j\2\2\u01b4\u01b5\7{\2\2\u01b5"+
		"\u01b6\7r\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7v\2\2"+
		"\u01b9\u01ba\7c\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7i\2\2\u01bc\u01bd"+
		"\7g\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7m\2\2\u01c0"+
		"\u01c1\7g\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7g\2\2"+
		"\u01c4\u01c5\7n\2\2\u01c5\60\3\2\2\2\u01c6\u01c7\7u\2\2\u01c7\u01c8\7"+
		"r\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb\7u\2\2\u01cb\u01cc"+
		"\7g\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7j\2\2\u01ce\u01cf\7k\2\2\u01cf"+
		"\u01d0\7p\2\2\u01d0\u01d1\7r\2\2\u01d1\u01d2\7n\2\2\u01d2\u01d3\7c\2\2"+
		"\u01d3\u01d4\7v\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7"+
		"\7r\2\2\u01d7\u01d8\7n\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7p\2\2\u01da"+
		"\u01db\7g\2\2\u01db\u01dc\7m\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7t\2\2"+
		"\u01de\u01df\7p\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7n\2\2\u01e1\62\3\2"+
		"\2\2\u01e2\u01e3\7d\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6"+
		"\7c\2\2\u01e6\u01e7\7t\2\2\u01e7\u01e8\7{\2\2\u01e8\u01e9\7u\2\2\u01e9"+
		"\u01ea\7r\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7u\2\2"+
		"\u01ed\u01ee\7g\2\2\u01ee\u01ef\7i\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1"+
		"\7w\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3\7u\2\2\u01f3\u01f4\7m\2\2\u01f4"+
		"\u01f5\7g\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7p\2\2\u01f7\u01f8\7g\2\2"+
		"\u01f8\u01f9\7n\2\2\u01f9\64\3\2\2\2\u01fa\u01fb\7d\2\2\u01fb\u01fc\7"+
		"k\2\2\u01fc\u01fd\7p\2\2\u01fd\u01fe\7c\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200"+
		"\7{\2\2\u0200\u0201\7u\2\2\u0201\u0202\7r\2\2\u0202\u0203\7c\2\2\u0203"+
		"\u0204\7t\2\2\u0204\u0205\7u\2\2\u0205\u0206\7g\2\2\u0206\u0207\7n\2\2"+
		"\u0207\u0208\7c\2\2\u0208\u0209\7r\2\2\u0209\u020a\7n\2\2\u020a\u020b"+
		"\7c\2\2\u020b\u020c\7e\2\2\u020c\u020d\7g\2\2\u020d\u020e\7m\2\2\u020e"+
		"\u020f\7g\2\2\u020f\u0210\7t\2\2\u0210\u0211\7p\2\2\u0211\u0212\7g\2\2"+
		"\u0212\u0213\7n\2\2\u0213\66\3\2\2\2\u0214\u0215\7d\2\2\u0215\u0216\7"+
		"k\2\2\u0216\u0217\7p\2\2\u0217\u0218\7c\2\2\u0218\u0219\7t\2\2\u0219\u021a"+
		"\7{\2\2\u021a\u021b\7u\2\2\u021b\u021c\7r\2\2\u021c\u021d\7c\2\2\u021d"+
		"\u021e\7t\2\2\u021e\u021f\7u\2\2\u021f\u0220\7g\2\2\u0220\u0221\7n\2\2"+
		"\u0221\u0222\7k\2\2\u0222\u0223\7p\2\2\u0223\u0224\7g\2\2\u0224\u0225"+
		"\7c\2\2\u0225\u0226\7t\2\2\u0226\u0227\7m\2\2\u0227\u0228\7g\2\2\u0228"+
		"\u0229\7t\2\2\u0229\u022a\7p\2\2\u022a\u022b\7g\2\2\u022b\u022c\7n\2\2"+
		"\u022c8\3\2\2\2\u022d\u022e\7d\2\2\u022e\u022f\7k\2\2\u022f\u0230\7p\2"+
		"\2\u0230\u0231\7c\2\2\u0231\u0232\7t\2\2\u0232\u0233\7{\2\2\u0233\u0234"+
		"\7u\2\2\u0234\u0235\7r\2\2\u0235\u0236\7c\2\2\u0236\u0237\7t\2\2\u0237"+
		"\u0238\7u\2\2\u0238\u0239\7g\2\2\u0239\u023a\7r\2\2\u023a\u023b\7q\2\2"+
		"\u023b\u023c\7n\2\2\u023c\u023d\7{\2\2\u023d\u023e\7m\2\2\u023e\u023f"+
		"\7g\2\2\u023f\u0240\7t\2\2\u0240\u0241\7p\2\2\u0241\u0242\7g\2\2\u0242"+
		"\u0243\7n\2\2\u0243:\3\2\2\2\u0244\u0245\7d\2\2\u0245\u0246\7k\2\2\u0246"+
		"\u0247\7p\2\2\u0247\u0248\7c\2\2\u0248\u0249\7t\2\2\u0249\u024a\7{\2\2"+
		"\u024a\u024b\7u\2\2\u024b\u024c\7r\2\2\u024c\u024d\7c\2\2\u024d\u024e"+
		"\7t\2\2\u024e\u024f\7u\2\2\u024f\u0250\7g\2\2\u0250\u0251\7j\2\2\u0251"+
		"\u0252\7{\2\2\u0252\u0253\7r\2\2\u0253\u0254\7g\2\2\u0254\u0255\7t\2\2"+
		"\u0255\u0256\7v\2\2\u0256\u0257\7c\2\2\u0257\u0258\7p\2\2\u0258\u0259"+
		"\7i\2\2\u0259\u025a\7g\2\2\u025a\u025b\7p\2\2\u025b\u025c\7v\2\2\u025c"+
		"\u025d\7m\2\2\u025d\u025e\7g\2\2\u025e\u025f\7t\2\2\u025f\u0260\7p\2\2"+
		"\u0260\u0261\7g\2\2\u0261\u0262\7n\2\2\u0262<\3\2\2\2\u0263\u0264\7d\2"+
		"\2\u0264\u0265\7k\2\2\u0265\u0266\7p\2\2\u0266\u0267\7c\2\2\u0267\u0268"+
		"\7t\2\2\u0268\u0269\7{\2\2\u0269\u026a\7u\2\2\u026a\u026b\7r\2\2\u026b"+
		"\u026c\7c\2\2\u026c\u026d\7t\2\2\u026d\u026e\7u\2\2\u026e\u026f\7g\2\2"+
		"\u026f\u0270\7v\2\2\u0270\u0271\7j\2\2\u0271\u0272\7k\2\2\u0272\u0273"+
		"\7p\2\2\u0273\u0274\7r\2\2\u0274\u0275\7n\2\2\u0275\u0276\7c\2\2\u0276"+
		"\u0277\7v\2\2\u0277\u0278\7g\2\2\u0278\u0279\7u\2\2\u0279\u027a\7r\2\2"+
		"\u027a\u027b\7n\2\2\u027b\u027c\7k\2\2\u027c\u027d\7p\2\2\u027d\u027e"+
		"\7g\2\2\u027e\u027f\7m\2\2\u027f\u0280\7g\2\2\u0280\u0281\7t\2\2\u0281"+
		"\u0282\7p\2\2\u0282\u0283\7g\2\2\u0283\u0284\7n\2\2\u0284>\3\2\2\2\u0285"+
		"\u0286\7t\2\2\u0286\u0287\7d\2\2\u0287\u0288\7h\2\2\u0288\u0289\7p\2\2"+
		"\u0289\u028a\7g\2\2\u028a\u028b\7v\2\2\u028b@\3\2\2\2\u028c\u028d\7t\2"+
		"\2\u028d\u028e\7h\2\2\u028e\u028f\7q\2\2\u028f\u0290\7t\2\2\u0290\u0291"+
		"\7g\2\2\u0291\u0292\7u\2\2\u0292\u0293\7v\2\2\u0293\u0294\7e\2\2\u0294"+
		"B\3\2\2\2\u0295\u0296\7h\2\2\u0296\u0297\7n\2\2\u0297\u0298\7f\2\2\u0298"+
		"D\3\2\2\2\u0299\u029a\7s\2\2\u029a\u029b\7f\2\2\u029b\u029c\7c\2\2\u029c"+
		"F\3\2\2\2\u029d\u029e\7n\2\2\u029e\u029f\7f\2\2\u029f\u02a0\7c\2\2\u02a0"+
		"H\3\2\2\2\u02a1\u02a2\7t\2\2\u02a2\u02a3\7f\2\2\u02a3\u02a4\7c\2\2\u02a4"+
		"J\3\2\2\2\u02a5\u02a6\7n\2\2\u02a6\u02a7\7t\2\2\u02a7\u02a8\7g\2\2\u02a8"+
		"\u02a9\7i\2\2\u02a9\u02aa\7t\2\2\u02aa\u02ab\7g\2\2\u02ab\u02ac\7u\2\2"+
		"\u02ac\u02ad\7u\2\2\u02adL\3\2\2\2\u02ae\u02af\7p\2\2\u02af\u02b0\7d\2"+
		"\2\u02b0\u02b1\7c\2\2\u02b1\u02b2\7{\2\2\u02b2\u02b3\7g\2\2\u02b3\u02b4"+
		"\7u\2\2\u02b4N\3\2\2\2\u02b5\u02b6\7p\2\2\u02b6\u02b7\7g\2\2\u02b7\u02b8"+
		"\7w\2\2\u02b8\u02b9\7t\2\2\u02b9\u02ba\7c\2\2\u02ba\u02bb\7n\2\2\u02bb"+
		"\u02bc\7p\2\2\u02bc\u02bd\7g\2\2\u02bd\u02be\7v\2\2\u02beP\3\2\2\2\u02bf"+
		"\u02c0\7m\2\2\u02c0\u02c1\7p\2\2\u02c1\u02c2\7p\2\2\u02c2R\3\2\2\2\u02c3"+
		"\u02c4\7e\2\2\u02c4\u02c5\7n\2\2\u02c5\u02c6\7c\2\2\u02c6\u02c7\7u\2\2"+
		"\u02c7\u02c8\7u\2\2\u02c8\u02c9\7g\2\2\u02c9\u02ca\7t\2\2\u02ca\u02cb"+
		"\7t\2\2\u02cb\u02cc\7q\2\2\u02cc\u02cd\7t\2\2\u02cdT\3\2\2\2\u02ce\u02cf"+
		"\7f\2\2\u02cf\u02d0\7v\2\2\u02d0\u02d1\7t\2\2\u02d1\u02d2\7g\2\2\u02d2"+
		"\u02d3\7g\2\2\u02d3V\3\2\2\2\u02d4\u02d5\7i\2\2\u02d5\u02d6\7r\2\2\u02d6"+
		"X\3\2\2\2\u02d7\u02d8\7t\2\2\u02d8\u02d9\7v\2\2\u02d9\u02da\7t\2\2\u02da"+
		"\u02db\7g\2\2\u02db\u02dc\7g\2\2\u02dcZ\3\2\2\2\u02dd\u02de\7t\2\2\u02de"+
		"\u02df\7h\2\2\u02df\u02e0\7q\2\2\u02e0\u02e1\7t\2\2\u02e1\u02e2\7g\2\2"+
		"\u02e2\u02e3\7u\2\2\u02e3\u02e4\7v\2\2\u02e4\u02e5\7t\2\2\u02e5\\\3\2"+
		"\2\2\u02e6\u02e7\7t\2\2\u02e7\u02e8\7k\2\2\u02e8\u02e9\7f\2\2\u02e9\u02ea"+
		"\7i\2\2\u02ea\u02eb\7g\2\2\u02eb\u02ec\7t\2\2\u02ec^\3\2\2\2\u02ed\u02ee"+
		"\7u\2\2\u02ee\u02ef\7x\2\2\u02ef\u02f0\7t\2\2\u02f0`\3\2\2\2\u02f1\u02f2"+
		"\7g\2\2\u02f2\u02f3\7p\2\2\u02f3\u02f4\7v\2\2\u02f4\u02f5\7t\2\2\u02f5"+
		"\u02f6\7q\2\2\u02f6\u02f7\7r\2\2\u02f7\u02f8\7{\2\2\u02f8b\3\2\2\2\u02f9"+
		"\u02fa\7i\2\2\u02fa\u02fb\7k\2\2\u02fb\u02fc\7p\2\2\u02fc\u02fd\7k\2\2"+
		"\u02fdd\3\2\2\2\u02fe\u02ff\7f\2\2\u02ff\u0300\7v\2\2\u0300\u0301\7t\2"+
		"\2\u0301\u0302\7c\2\2\u0302\u0303\7k\2\2\u0303\u0304\7p\2\2\u0304f\3\2"+
		"\2\2\u0305\u0306\7v\2\2\u0306\u0307\7t\2\2\u0307\u0308\7c\2\2\u0308\u0309"+
		"\7k\2\2\u0309\u030a\7p\2\2\u030ah\3\2\2\2\u030b\u030c\7h\2\2\u030c\u030d"+
		"\7h\2\2\u030d\u030e\7v\2\2\u030ej\3\2\2\2\u030f\u0310\7h\2\2\u0310\u0311"+
		"\7q\2\2\u0311\u0312\7t\2\2\u0312\u0313\7y\2\2\u0313\u0314\7c\2\2\u0314"+
		"\u0315\7t\2\2\u0315\u0316\7f\2\2\u0316l\3\2\2\2\u0317\u0318\7k\2\2\u0318"+
		"\u0319\7p\2\2\u0319\u031a\7x\2\2\u031a\u031b\7g\2\2\u031b\u031c\7t\2\2"+
		"\u031c\u031d\7u\2\2\u031d\u031e\7g\2\2\u031en\3\2\2\2\u031f\u0320\7u\2"+
		"\2\u0320\u0321\7v\2\2\u0321\u0322\7c\2\2\u0322\u0323\7p\2\2\u0323\u0324"+
		"\7f\2\2\u0324\u0325\7c\2\2\u0325\u0326\7t\2\2\u0326\u0327\7f\2\2\u0327"+
		"p\3\2\2\2\u0328\u0329\7w\2\2\u0329\u032a\7p\2\2\u032a\u032b\7k\2\2\u032b"+
		"\u032c\7v\2\2\u032c\u032d\7c\2\2\u032d\u032e\7t\2\2\u032e\u032f\7{\2\2"+
		"\u032fr\3\2\2\2\u0330\u0331\7o\2\2\u0331\u0332\7c\2\2\u0332\u0333\7v\2"+
		"\2\u0333\u0334\7t\2\2\u0334\u0335\7k\2\2\u0335\u0336\7z\2\2\u0336t\3\2"+
		"\2\2\u0337\u0338\7x\2\2\u0338\u0339\7g\2\2\u0339\u033a\7e\2\2\u033a\u033b"+
		"\7v\2\2\u033bv\3\2\2\2\u033c\u033d\7s\2\2\u033d\u033e\7w\2\2\u033e\u033f"+
		"\7g\2\2\u033f\u0340\7t\2\2\u0340\u0341\7{\2\2\u0341\u0342\7C\2\2\u0342"+
		"\u0343\7t\2\2\u0343\u0344\7i\2\2\u0344\u0345\7u\2\2\u0345x\3\2\2\2\u0346"+
		"\u0347\7o\2\2\u0347\u0348\7q\2\2\u0348\u0349\7f\2\2\u0349\u034a\7g\2\2"+
		"\u034a\u034b\7n\2\2\u034bz\3\2\2\2\u034c\u034d\7h\2\2\u034d\u034e\7k\2"+
		"\2\u034e\u034f\7g\2\2\u034f\u0350\7n\2\2\u0350\u0351\7f\2\2\u0351\u0352"+
		"\7u\2\2\u0352|\3\2\2\2\u0353\u0354\7t\2\2\u0354\u0355\7g\2\2\u0355\u0356"+
		"\7i\2\2\u0356\u0357\7k\2\2\u0357\u0358\7q\2\2\u0358\u0359\7p\2\2\u0359"+
		"~\3\2\2\2\u035a\u035b\7t\2\2\u035b\u035c\7o\2\2\u035c\u0080\3\2\2\2\u035d"+
		"\u035e\7n\2\2\u035e\u035f\7u\2\2\u035f\u0082\3\2\2\2\u0360\u0361\7r\2"+
		"\2\u0361\u0362\7t\2\2\u0362\u0363\7k\2\2\u0363\u0364\7p\2\2\u0364\u0365"+
		"\7v\2\2\u0365\u0084\3\2\2\2\u0366\u0367\7r\2\2\u0367\u0368\7t\2\2\u0368"+
		"\u0369\7g\2\2\u0369\u036a\7f\2\2\u036a\u036b\7k\2\2\u036b\u036c\7e\2\2"+
		"\u036c\u036d\7v\2\2\u036d\u0086\3\2\2\2\u036e\u036f\7m\2\2\u036f\u0088"+
		"\3\2\2\2\u0370\u0371\7n\2\2\u0371\u0372\7c\2\2\u0372\u0373\7o\2\2\u0373"+
		"\u0374\7d\2\2\u0374\u0375\7f\2\2\u0375\u0376\7c\2\2\u0376\u008a\3\2\2"+
		"\2\u0377\u0378\7u\2\2\u0378\u0379\7x\2\2\u0379\u037a\7o\2\2\u037a\u008c"+
		"\3\2\2\2\u037b\u037c\7e\2\2\u037c\u037d\7r\2\2\u037d\u008e\3\2\2\2\u037e"+
		"\u037f\7e\2\2\u037f\u0380\7p\2\2\u0380\u0090\3\2\2\2\u0381\u0382\7s\2"+
		"\2\u0382\u0383\7w\2\2\u0383\u0384\7g\2\2\u0384\u0385\7t\2\2\u0385\u0386"+
		"\7{\2\2\u0386\u0092\3\2\2\2\u0387\u0388\7g\2\2\u0388\u0389\7z\2\2\u0389"+
		"\u038a\7g\2\2\u038a\u038b\7e\2\2\u038b\u038c\7w\2\2\u038c\u038d\7v\2\2"+
		"\u038d\u038e\7g\2\2\u038e\u0094\3\2\2\2\u038f\u0390\7]\2\2\u0390\u0096"+
		"\3\2\2\2\u0391\u0392\7_\2\2\u0392\u0098\3\2\2\2\u0393\u0394\7*\2\2\u0394"+
		"\u009a\3\2\2\2\u0395\u0396\7+\2\2\u0396\u009c\3\2\2\2\u0397\u0398\7}\2"+
		"\2\u0398\u009e\3\2\2\2\u0399\u039a\7\177\2\2\u039a\u00a0\3\2\2\2\u039b"+
		"\u039c\7$\2\2\u039c\u00a2\3\2\2\2\u039d\u039e\7.\2\2\u039e\u00a4\3\2\2"+
		"\2\u039f\u03a0\7?\2\2\u03a0\u00a6\3\2\2\2\u03a1\u03a5\t\2\2\2\u03a2\u03a4"+
		"\t\3\2\2\u03a3\u03a2\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u00a8\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9\t\4"+
		"\2\2\u03a9\u00aa\3\2\2\2\u03aa\u03ac\5\u00a9U\2\u03ab\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b5\3\2"+
		"\2\2\u03af\u03b1\7\60\2\2\u03b0\u03b2\5\u00a9U\2\u03b1\u03b0\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2"+
		"\2\2\u03b5\u03af\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u00ac\3\2\2\2\u03b7"+
		"\u03b9\5\u00a1Q\2\u03b8\u03ba\n\5\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bb"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03be\5\u00a1Q\2\u03be\u00ae\3\2\2\2\u03bf\u03c1\t\6\2\2\u03c0\u03bf"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u03c5\bX\2\2\u03c5\u00b0\3\2\2\2\t\2\u03a5\u03ad"+
		"\u03b3\u03b5\u03bb\u03c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
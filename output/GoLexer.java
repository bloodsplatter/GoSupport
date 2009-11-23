// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/bloodsplatter/Projects/GoSupport/GoLexer.g 2009-11-23 10:47:37
package be.jonas.gogrammar

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GoLexer extends Lexer {
    public static final int PACKAGE=21;
    public static final int EXPONENT=43;
    public static final int DECIMALS=42;
    public static final int INT_LIT=41;
    public static final int LGT=79;
    public static final int SQBRACECLOSE=100;
    public static final int LETTER=30;
    public static final int CONST=7;
    public static final int BSHIFTL=68;
    public static final int OCTAL_ESC=37;
    public static final int CASE=5;
    public static final int BSHIFTR=69;
    public static final int CHAN=6;
    public static final int SEPARATOR=106;
    public static final int NOT=78;
    public static final int EOF=-1;
    public static final int BORASSIGN=90;
    public static final int DECIMAL_LIT=38;
    public static final int BREAK=4;
    public static final int OCTAL_DIGIT=49;
    public static final int RAW_STRING_LIT=55;
    public static final int TYPE=27;
    public static final int NOTEQUAL=77;
    public static final int IMPORT=18;
    public static final int INCR=74;
    public static final int FLOAT_LIT=44;
    public static final int RETURN=23;
    public static final int CHANOP=73;
    public static final int SMTOREQUAL=95;
    public static final int VAR=28;
    public static final int UNICODE_LETTER=29;
    public static final int GOTO=16;
    public static final int COMMENT=58;
    public static final int PLUSASSIGN=84;
    public static final int SELECT=24;
    public static final int DIVIDE=63;
    public static final int ASSIGNINIT=83;
    public static final int SWITCH=26;
    public static final int ELSE=11;
    public static final int CHAR_LIT=53;
    public static final int MULTIPLYASSIGN=86;
    public static final int BRACEOPEN=97;
    public static final int WS=59;
    public static final int OCTAL_LIT=39;
    public static final int FUNC=14;
    public static final int OR=72;
    public static final int LITTLE_U_VALUE=47;
    public static final int GO=15;
    public static final int HEX_LIT=40;
    public static final int HEX_BYTE_VALUE=48;
    public static final int STRING_LIT=57;
    public static final int BANDNOTASSIGN=94;
    public static final int BSHIFTRASSIGN=93;
    public static final int FOR=13;
    public static final int SLICE=82;
    public static final int ID=32;
    public static final int AND=71;
    public static final int ESCAPED_CHAR=45;
    public static final int FALLTHROUGH=12;
    public static final int IF=17;
    public static final int RBRACEOPEN=101;
    public static final int SELECTOR=103;
    public static final int ESC_SEQ=33;
    public static final int CONTINUE=8;
    public static final int MULTIPLY=62;
    public static final int COMMA=105;
    public static final int BXORASSIGN=91;
    public static final int BOR=66;
    public static final int EQUAL=76;
    public static final int UNICODE_VALUE=52;
    public static final int PLUS=60;
    public static final int BXOR=67;
    public static final int DIGIT=31;
    public static final int BRACECLOSE=98;
    public static final int BYTE_VALUE=51;
    public static final int STRINGLIT=56;
    public static final int SMT=80;
    public static final int PARAMS=104;
    public static final int DEFER=10;
    public static final int SQBRACEOPEN=99;
    public static final int MODASSIGN=88;
    public static final int BANDNOT=70;
    public static final int UNICODE_ESC=36;
    public static final int DEFAULT=9;
    public static final int AMPERSAND=65;
    public static final int HEX_DIGIT=35;
    public static final int RANGE=22;
    public static final int STRUCT=25;
    public static final int BSHIFTLASSIGN=92;
    public static final int MINUS=61;
    public static final int MINUSASSIGN=85;
    public static final int BIG_U_VALUE=46;
    public static final int OCTAL_BYTE_VALUE=50;
    public static final int DIVIDEASSIGN=87;
    public static final int RBRACECLOSE=102;
    public static final int MODULUS=64;
    public static final int MAP=20;
    public static final int ASSIGN=81;
    public static final int DECR=75;
    public static final int INTERFACE=19;
    public static final int LGTOREQUAL=96;
    public static final int INTERPRETED_STRING_LIT=54;
    public static final int BANDASSIGN=89;
    public static final int STRING=34;

    // delegates
    // delegators

    public GoLexer() {;} 
    public GoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/bloodsplatter/Projects/GoSupport/GoLexer.g"; }

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:7:7: ( 'break' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:7:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:10:6: ( 'case' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:10:8: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CHAN"
    public final void mCHAN() throws RecognitionException {
        try {
            int _type = CHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:11:6: ( 'chan' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:11:8: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAN"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:12:7: ( 'const' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:12:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:13:9: ( 'continue' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:13:11: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:14:9: ( 'default' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:14:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DEFER"
    public final void mDEFER() throws RecognitionException {
        try {
            int _type = DEFER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:15:7: ( 'defer' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:15:9: 'defer'
            {
            match("defer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFER"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:16:6: ( 'else' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:16:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FALLTHROUGH"
    public final void mFALLTHROUGH() throws RecognitionException {
        try {
            int _type = FALLTHROUGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:18:2: ( 'fallthrough' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:18:4: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALLTHROUGH"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:19:5: ( 'for' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:19:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:20:6: ( 'funct' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:20:8: 'funct'
            {
            match("funct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "GO"
    public final void mGO() throws RecognitionException {
        try {
            int _type = GO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:21:4: ( 'go' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:21:6: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GO"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:22:6: ( 'goto' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:22:8: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:23:4: ( 'if' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:23:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:24:8: ( 'import' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:24:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:26:2: ( 'interface' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:26:4: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "MAP"
    public final void mMAP() throws RecognitionException {
        try {
            int _type = MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:27:5: ( 'map' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:27:7: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAP"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:28:9: ( 'package' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:28:11: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "RANGE"
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:29:7: ( 'range' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:29:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:30:8: ( 'return' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:30:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:31:8: ( 'select' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:31:10: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "STRUCT"
    public final void mSTRUCT() throws RecognitionException {
        try {
            int _type = STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:32:8: ( 'struct' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:32:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRUCT"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:33:8: ( 'switch' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:33:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:34:6: ( 'type' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:34:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:35:5: ( 'var' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:35:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "UNICODE_LETTER"
    public final void mUNICODE_LETTER() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:38:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_LETTER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:41:8: ( UNICODE_LETTER | '_' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:44:7: ( '0' .. '9' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:44:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:46:5: ( LETTER ( LETTER | DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:46:7: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:46:14: ( LETTER | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:49:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:49:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:49:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:49:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:49:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:53:11: ( ( DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:53:13: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:57:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt3=1;
                    }
                    break;
                case 'u':
                    {
                    alt3=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:57:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:58:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:59:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='3')) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2>='0' && LA4_2<='7')) ) {
                        int LA4_5 = input.LA(4);

                        if ( ((LA4_5>='0' && LA4_5<='7')) ) {
                            alt4=1;
                        }
                        else {
                            alt4=2;}
                    }
                    else {
                        alt4=3;}
                }
                else if ( ((LA4_1>='4' && LA4_1<='7')) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>='0' && LA4_3<='7')) ) {
                        alt4=2;
                    }
                    else {
                        alt4=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:14: ( '0' .. '3' )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:25: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:36: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:64:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:65:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:65:14: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:65:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:65:25: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:65:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:66:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:66:14: ( '0' .. '7' )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:66:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:71:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:71:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "DECIMAL_LIT"
    public final void mDECIMAL_LIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:76:2: ( '1' .. '9' ( DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:76:4: '1' .. '9' ( DIGIT )*
            {
            matchRange('1','9'); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:76:13: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:76:14: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LIT"

    // $ANTLR start "OCTAL_LIT"
    public final void mOCTAL_LIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:80:2: ( '0' ( '0' .. '7' )* )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:80:4: '0' ( '0' .. '7' )*
            {
            match('0'); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:80:8: ( '0' .. '7' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:80:9: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_LIT"

    // $ANTLR start "HEX_LIT"
    public final void mHEX_LIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:83:9: ( '0' ( 'x' | 'X' ) HEX_DIGIT ( HEX_DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:83:11: '0' ( 'x' | 'X' ) HEX_DIGIT ( HEX_DIGIT )*
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mHEX_DIGIT(); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:83:38: ( HEX_DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:83:38: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_LIT"

    // $ANTLR start "INT_LIT"
    public final void mINT_LIT() throws RecognitionException {
        try {
            int _type = INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:85:9: ( DECIMAL_LIT | OCTAL_LIT | HEX_LIT )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='X'||LA8_2=='x') ) {
                    alt8=3;
                }
                else {
                    alt8=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:85:11: DECIMAL_LIT
                    {
                    mDECIMAL_LIT(); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:85:25: OCTAL_LIT
                    {
                    mOCTAL_LIT(); 

                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:85:37: HEX_LIT
                    {
                    mHEX_LIT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_LIT"

    // $ANTLR start "DECIMALS"
    public final void mDECIMALS() throws RecognitionException {
        try {
            int _type = DECIMALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:87:9: ( DIGIT ( DIGIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:87:11: DIGIT ( DIGIT )*
            {
            mDIGIT(); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:87:17: ( DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:87:18: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMALS"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:89:9: ( ( 'e' | 'E' ) ( '+' | '-' )? DECIMALS )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:89:11: ( 'e' | 'E' ) ( '+' | '-' )? DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:89:21: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDECIMALS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "FLOAT_LIT"
    public final void mFLOAT_LIT() throws RecognitionException {
        try {
            int _type = FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:2: ( ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? ) | ( DECIMALS EXPONENT ) | ( '.' DECIMALS ( EXPONENT )? ) )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:4: ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:4: ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:5: DECIMALS '.' ( DECIMALS )? ( EXPONENT )?
                    {
                    mDECIMALS(); 
                    match('.'); 
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:18: ( DECIMALS )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:18: DECIMALS
                            {
                            mDECIMALS(); 

                            }
                            break;

                    }

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:28: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:28: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:41: ( DECIMALS EXPONENT )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:41: ( DECIMALS EXPONENT )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:42: DECIMALS EXPONENT
                    {
                    mDECIMALS(); 
                    mEXPONENT(); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:63: ( '.' DECIMALS ( EXPONENT )? )
                    {
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:63: ( '.' DECIMALS ( EXPONENT )? )
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:64: '.' DECIMALS ( EXPONENT )?
                    {
                    match('.'); 
                    mDECIMALS(); 
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:77: ( EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:92:77: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT_LIT"

    // $ANTLR start "ESCAPED_CHAR"
    public final void mESCAPED_CHAR() throws RecognitionException {
        try {
            int _type = ESCAPED_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:95:2: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:96:2: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESCAPED_CHAR"

    // $ANTLR start "BIG_U_VALUE"
    public final void mBIG_U_VALUE() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:100:2: ( '\\\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:100:4: '\\\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('U'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "BIG_U_VALUE"

    // $ANTLR start "LITTLE_U_VALUE"
    public final void mLITTLE_U_VALUE() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:104:2: ( UNICODE_ESC )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:104:4: UNICODE_ESC
            {
            mUNICODE_ESC(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LITTLE_U_VALUE"

    // $ANTLR start "HEX_BYTE_VALUE"
    public final void mHEX_BYTE_VALUE() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:108:2: ( '\\\\' HEX_DIGIT HEX_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:108:4: '\\\\' HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_BYTE_VALUE"

    // $ANTLR start "OCTAL_DIGIT"
    public final void mOCTAL_DIGIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:112:2: ( ( '0' .. '7' ) )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:112:4: ( '0' .. '7' )
            {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:112:4: ( '0' .. '7' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:112:5: '0' .. '7'
            {
            matchRange('0','7'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_DIGIT"

    // $ANTLR start "OCTAL_BYTE_VALUE"
    public final void mOCTAL_BYTE_VALUE() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:116:2: ( '\\\\' OCTAL_DIGIT OCTAL_DIGIT OCTAL_DIGIT )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:116:4: '\\\\' OCTAL_DIGIT OCTAL_DIGIT OCTAL_DIGIT
            {
            match('\\'); 
            mOCTAL_DIGIT(); 
            mOCTAL_DIGIT(); 
            mOCTAL_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_BYTE_VALUE"

    // $ANTLR start "BYTE_VALUE"
    public final void mBYTE_VALUE() throws RecognitionException {
        try {
            int _type = BYTE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:119:2: ( OCTAL_BYTE_VALUE | HEX_BYTE_VALUE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>='0' && LA15_1<='7')) ) {
                    int LA15_2 = input.LA(3);

                    if ( ((LA15_2>='0' && LA15_2<='7')) ) {
                        int LA15_4 = input.LA(4);

                        if ( ((LA15_4>='0' && LA15_4<='7')) ) {
                            alt15=1;
                        }
                        else {
                            alt15=2;}
                    }
                    else if ( ((LA15_2>='8' && LA15_2<='9')||(LA15_2>='A' && LA15_2<='F')||(LA15_2>='a' && LA15_2<='f')) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA15_1>='8' && LA15_1<='9')||(LA15_1>='A' && LA15_1<='F')||(LA15_1>='a' && LA15_1<='f')) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:119:4: OCTAL_BYTE_VALUE
                    {
                    mOCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:119:23: HEX_BYTE_VALUE
                    {
                    mHEX_BYTE_VALUE(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE_VALUE"

    // $ANTLR start "UNICODE_VALUE"
    public final void mUNICODE_VALUE() throws RecognitionException {
        try {
            int _type = UNICODE_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:122:2: ( UNICODE_LETTER | LITTLE_U_VALUE | BIG_U_VALUE )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='A' && LA16_0<='Z')||(LA16_0>='a' && LA16_0<='z')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='\\') ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2=='u') ) {
                    alt16=2;
                }
                else if ( (LA16_2=='U') ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:122:4: UNICODE_LETTER
                    {
                    mUNICODE_LETTER(); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:122:21: LITTLE_U_VALUE
                    {
                    mLITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:122:38: BIG_U_VALUE
                    {
                    mBIG_U_VALUE(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_VALUE"

    // $ANTLR start "CHAR_LIT"
    public final void mCHAR_LIT() throws RecognitionException {
        try {
            int _type = CHAR_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:124:9: ( '\\'' ( UNICODE_VALUE | BYTE_VALUE ) '\\'' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:124:11: '\\'' ( UNICODE_VALUE | BYTE_VALUE ) '\\''
            {
            match('\''); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:124:16: ( UNICODE_VALUE | BYTE_VALUE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='A' && LA17_0<='Z')||(LA17_0>='a' && LA17_0<='z')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='\\') ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2=='U'||LA17_2=='u') ) {
                    alt17=1;
                }
                else if ( ((LA17_2>='0' && LA17_2<='9')||(LA17_2>='A' && LA17_2<='F')||(LA17_2>='a' && LA17_2<='f')) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:124:17: UNICODE_VALUE
                    {
                    mUNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:124:33: BYTE_VALUE
                    {
                    mBYTE_VALUE(); 

                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR_LIT"

    // $ANTLR start "INTERPRETED_STRING_LIT"
    public final void mINTERPRETED_STRING_LIT() throws RecognitionException {
        try {
            int _type = INTERPRETED_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:127:2: ( '\"' ( UNICODE_VALUE | BYTE_VALUE )* '\"' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:127:4: '\"' ( UNICODE_VALUE | BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:127:8: ( UNICODE_VALUE | BYTE_VALUE )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='A' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3=='U'||LA18_3=='u') ) {
                        alt18=1;
                    }
                    else if ( ((LA18_3>='0' && LA18_3<='9')||(LA18_3>='A' && LA18_3<='F')||(LA18_3>='a' && LA18_3<='f')) ) {
                        alt18=2;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:127:9: UNICODE_VALUE
            	    {
            	    mUNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:127:25: BYTE_VALUE
            	    {
            	    mBYTE_VALUE(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERPRETED_STRING_LIT"

    // $ANTLR start "RAW_STRING_LIT"
    public final void mRAW_STRING_LIT() throws RecognitionException {
        try {
            int _type = RAW_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:130:2: ( '`' ( UNICODE_LETTER )* '`' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:130:4: '`' ( UNICODE_LETTER )* '`'
            {
            match('`'); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:130:8: ( UNICODE_LETTER )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:130:8: UNICODE_LETTER
            	    {
            	    mUNICODE_LETTER(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAW_STRING_LIT"

    // $ANTLR start "STRINGLIT"
    public final void mSTRINGLIT() throws RecognitionException {
        try {
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:134:2: ( RAW_STRING_LIT | INTERPRETED_STRING_LIT )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='`') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\"') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:134:4: RAW_STRING_LIT
                    {
                    mRAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:134:21: INTERPRETED_STRING_LIT
                    {
                    mINTERPRETED_STRING_LIT(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "STRINGLIT"

    // $ANTLR start "STRING_LIT"
    public final void mSTRING_LIT() throws RecognitionException {
        try {
            int _type = STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:137:2: ( STRINGLIT ( STRINGLIT )* )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:137:4: STRINGLIT ( STRINGLIT )*
            {
            mSTRINGLIT(); 
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:137:14: ( STRINGLIT )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\"'||LA21_0=='`') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:137:14: STRINGLIT
            	    {
            	    mSTRINGLIT(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:140:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='/') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='/') ) {
                    alt25=1;
                }
                else if ( (LA25_1=='*') ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:140:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:140:14: (~ ( '\\n' | '\\r' ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:140:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:140:28: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:140:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:141:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:141:14: ( options {greedy=false; } : . )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='*') ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1=='/') ) {
                                alt24=2;
                            }
                            else if ( ((LA24_1>='\u0000' && LA24_1<='.')||(LA24_1>='0' && LA24_1<='\uFFFF')) ) {
                                alt24=1;
                            }


                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<=')')||(LA24_0>='+' && LA24_0<='\uFFFF')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:141:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:144:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:144:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:151:6: ( '+' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:151:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:152:7: ( '-' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:152:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:153:9: ( '*' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:153:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:154:8: ( '/' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:154:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "MODULUS"
    public final void mMODULUS() throws RecognitionException {
        try {
            int _type = MODULUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:155:9: ( '%' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:155:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULUS"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:156:11: ( '&' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:156:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:157:5: ( '|' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:157:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "BXOR"
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:158:6: ( '^' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:158:8: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BXOR"

    // $ANTLR start "BSHIFTL"
    public final void mBSHIFTL() throws RecognitionException {
        try {
            int _type = BSHIFTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:159:9: ( '<<' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:159:11: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSHIFTL"

    // $ANTLR start "BSHIFTR"
    public final void mBSHIFTR() throws RecognitionException {
        try {
            int _type = BSHIFTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:160:9: ( '>>' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:160:11: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSHIFTR"

    // $ANTLR start "BANDNOT"
    public final void mBANDNOT() throws RecognitionException {
        try {
            int _type = BANDNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:161:9: ( AMPERSAND BXOR )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:161:11: AMPERSAND BXOR
            {
            mAMPERSAND(); 
            mBXOR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANDNOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:162:5: ( '&&' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:162:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:163:4: ( '||' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:163:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "CHANOP"
    public final void mCHANOP() throws RecognitionException {
        try {
            int _type = CHANOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:164:8: ( '<-' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:164:10: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHANOP"

    // $ANTLR start "INCR"
    public final void mINCR() throws RecognitionException {
        try {
            int _type = INCR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:165:6: ( '++' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:165:8: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCR"

    // $ANTLR start "DECR"
    public final void mDECR() throws RecognitionException {
        try {
            int _type = DECR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:166:6: ( '--' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:166:8: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECR"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:167:7: ( '==' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:167:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:168:9: ( '!=' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:168:11: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:169:5: ( '!' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:169:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "LGT"
    public final void mLGT() throws RecognitionException {
        try {
            int _type = LGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:170:5: ( '>' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:170:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LGT"

    // $ANTLR start "SMT"
    public final void mSMT() throws RecognitionException {
        try {
            int _type = SMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:171:5: ( '<' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:171:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:174:8: ( '=' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:174:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "ASSIGNINIT"
    public final void mASSIGNINIT() throws RecognitionException {
        try {
            int _type = ASSIGNINIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:176:2: ( SLICE ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:176:4: SLICE ASSIGN
            {
            mSLICE(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNINIT"

    // $ANTLR start "PLUSASSIGN"
    public final void mPLUSASSIGN() throws RecognitionException {
        try {
            int _type = PLUSASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:179:2: ( PLUS ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:179:4: PLUS ASSIGN
            {
            mPLUS(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSASSIGN"

    // $ANTLR start "MINUSASSIGN"
    public final void mMINUSASSIGN() throws RecognitionException {
        try {
            int _type = MINUSASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:181:2: ( MINUS ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:181:4: MINUS ASSIGN
            {
            mMINUS(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSASSIGN"

    // $ANTLR start "MULTIPLYASSIGN"
    public final void mMULTIPLYASSIGN() throws RecognitionException {
        try {
            int _type = MULTIPLYASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:183:2: ( MULTIPLY ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:183:4: MULTIPLY ASSIGN
            {
            mMULTIPLY(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLYASSIGN"

    // $ANTLR start "DIVIDEASSIGN"
    public final void mDIVIDEASSIGN() throws RecognitionException {
        try {
            int _type = DIVIDEASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:185:2: ( DIVIDE ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:185:4: DIVIDE ASSIGN
            {
            mDIVIDE(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDEASSIGN"

    // $ANTLR start "MODASSIGN"
    public final void mMODASSIGN() throws RecognitionException {
        try {
            int _type = MODASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:187:2: ( MODULUS ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:187:4: MODULUS ASSIGN
            {
            mMODULUS(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODASSIGN"

    // $ANTLR start "BANDASSIGN"
    public final void mBANDASSIGN() throws RecognitionException {
        try {
            int _type = BANDASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:189:2: ( AMPERSAND ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:189:4: AMPERSAND ASSIGN
            {
            mAMPERSAND(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANDASSIGN"

    // $ANTLR start "BORASSIGN"
    public final void mBORASSIGN() throws RecognitionException {
        try {
            int _type = BORASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:191:2: ( BOR ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:191:4: BOR ASSIGN
            {
            mBOR(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BORASSIGN"

    // $ANTLR start "BXORASSIGN"
    public final void mBXORASSIGN() throws RecognitionException {
        try {
            int _type = BXORASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:193:2: ( BXOR ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:193:4: BXOR ASSIGN
            {
            mBXOR(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BXORASSIGN"

    // $ANTLR start "BSHIFTLASSIGN"
    public final void mBSHIFTLASSIGN() throws RecognitionException {
        try {
            int _type = BSHIFTLASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:195:2: ( BSHIFTL ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:195:4: BSHIFTL ASSIGN
            {
            mBSHIFTL(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSHIFTLASSIGN"

    // $ANTLR start "BSHIFTRASSIGN"
    public final void mBSHIFTRASSIGN() throws RecognitionException {
        try {
            int _type = BSHIFTRASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:197:2: ( BSHIFTR ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:197:4: BSHIFTR ASSIGN
            {
            mBSHIFTR(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSHIFTRASSIGN"

    // $ANTLR start "BANDNOTASSIGN"
    public final void mBANDNOTASSIGN() throws RecognitionException {
        try {
            int _type = BANDNOTASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:199:2: ( BANDNOT ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:199:4: BANDNOT ASSIGN
            {
            mBANDNOT(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANDNOTASSIGN"

    // $ANTLR start "SMTOREQUAL"
    public final void mSMTOREQUAL() throws RecognitionException {
        try {
            int _type = SMTOREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:201:2: ( SMT ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:201:4: SMT ASSIGN
            {
            mSMT(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMTOREQUAL"

    // $ANTLR start "LGTOREQUAL"
    public final void mLGTOREQUAL() throws RecognitionException {
        try {
            int _type = LGTOREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:203:2: ( LGT ASSIGN )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:203:4: LGT ASSIGN
            {
            mLGT(); 
            mASSIGN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LGTOREQUAL"

    // $ANTLR start "BRACEOPEN"
    public final void mBRACEOPEN() throws RecognitionException {
        try {
            int _type = BRACEOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:206:2: ( '(' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:206:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRACEOPEN"

    // $ANTLR start "BRACECLOSE"
    public final void mBRACECLOSE() throws RecognitionException {
        try {
            int _type = BRACECLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:208:2: ( ')' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:208:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRACECLOSE"

    // $ANTLR start "SQBRACEOPEN"
    public final void mSQBRACEOPEN() throws RecognitionException {
        try {
            int _type = SQBRACEOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:210:2: ( '[' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:210:4: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQBRACEOPEN"

    // $ANTLR start "SQBRACECLOSE"
    public final void mSQBRACECLOSE() throws RecognitionException {
        try {
            int _type = SQBRACECLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:212:2: ( ']' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:212:4: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQBRACECLOSE"

    // $ANTLR start "RBRACEOPEN"
    public final void mRBRACEOPEN() throws RecognitionException {
        try {
            int _type = RBRACEOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:214:2: ( '{' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:214:4: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACEOPEN"

    // $ANTLR start "RBRACECLOSE"
    public final void mRBRACECLOSE() throws RecognitionException {
        try {
            int _type = RBRACECLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:216:2: ( '}' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:216:4: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACECLOSE"

    // $ANTLR start "SLICE"
    public final void mSLICE() throws RecognitionException {
        try {
            int _type = SLICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:217:7: ( ':' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:217:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLICE"

    // $ANTLR start "SELECTOR"
    public final void mSELECTOR() throws RecognitionException {
        try {
            int _type = SELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:218:10: ( '.' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:218:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECTOR"

    // $ANTLR start "PARAMS"
    public final void mPARAMS() throws RecognitionException {
        try {
            int _type = PARAMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:219:8: ( '...' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:219:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAMS"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:220:7: ( ',' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:220:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:222:2: ( ';' )
            // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:222:4: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEPARATOR"

    public void mTokens() throws RecognitionException {
        // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:8: ( BREAK | CASE | CHAN | CONST | CONTINUE | DEFAULT | DEFER | ELSE | FALLTHROUGH | FOR | FUNC | GO | GOTO | IF | IMPORT | INTERFACE | MAP | PACKAGE | RANGE | RETURN | SELECT | STRUCT | SWITCH | TYPE | VAR | ID | STRING | INT_LIT | DECIMALS | EXPONENT | FLOAT_LIT | ESCAPED_CHAR | BYTE_VALUE | UNICODE_VALUE | CHAR_LIT | INTERPRETED_STRING_LIT | RAW_STRING_LIT | STRING_LIT | COMMENT | WS | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | AMPERSAND | BOR | BXOR | BSHIFTL | BSHIFTR | BANDNOT | AND | OR | CHANOP | INCR | DECR | EQUAL | NOTEQUAL | NOT | LGT | SMT | ASSIGN | ASSIGNINIT | PLUSASSIGN | MINUSASSIGN | MULTIPLYASSIGN | DIVIDEASSIGN | MODASSIGN | BANDASSIGN | BORASSIGN | BXORASSIGN | BSHIFTLASSIGN | BSHIFTRASSIGN | BANDNOTASSIGN | SMTOREQUAL | LGTOREQUAL | BRACEOPEN | BRACECLOSE | SQBRACEOPEN | SQBRACECLOSE | RBRACEOPEN | RBRACECLOSE | SLICE | SELECTOR | PARAMS | COMMA | SEPARATOR )
        int alt26=87;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:10: BREAK
                {
                mBREAK(); 

                }
                break;
            case 2 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:16: CASE
                {
                mCASE(); 

                }
                break;
            case 3 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:21: CHAN
                {
                mCHAN(); 

                }
                break;
            case 4 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:26: CONST
                {
                mCONST(); 

                }
                break;
            case 5 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:32: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 6 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:41: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 7 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:49: DEFER
                {
                mDEFER(); 

                }
                break;
            case 8 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:55: ELSE
                {
                mELSE(); 

                }
                break;
            case 9 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:60: FALLTHROUGH
                {
                mFALLTHROUGH(); 

                }
                break;
            case 10 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:72: FOR
                {
                mFOR(); 

                }
                break;
            case 11 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:76: FUNC
                {
                mFUNC(); 

                }
                break;
            case 12 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:81: GO
                {
                mGO(); 

                }
                break;
            case 13 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:84: GOTO
                {
                mGOTO(); 

                }
                break;
            case 14 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:89: IF
                {
                mIF(); 

                }
                break;
            case 15 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:92: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 16 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:99: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 17 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:109: MAP
                {
                mMAP(); 

                }
                break;
            case 18 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:113: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 19 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:121: RANGE
                {
                mRANGE(); 

                }
                break;
            case 20 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:127: RETURN
                {
                mRETURN(); 

                }
                break;
            case 21 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:134: SELECT
                {
                mSELECT(); 

                }
                break;
            case 22 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:141: STRUCT
                {
                mSTRUCT(); 

                }
                break;
            case 23 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:148: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 24 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:155: TYPE
                {
                mTYPE(); 

                }
                break;
            case 25 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:160: VAR
                {
                mVAR(); 

                }
                break;
            case 26 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:164: ID
                {
                mID(); 

                }
                break;
            case 27 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:167: STRING
                {
                mSTRING(); 

                }
                break;
            case 28 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:174: INT_LIT
                {
                mINT_LIT(); 

                }
                break;
            case 29 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:182: DECIMALS
                {
                mDECIMALS(); 

                }
                break;
            case 30 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:191: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 31 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:200: FLOAT_LIT
                {
                mFLOAT_LIT(); 

                }
                break;
            case 32 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:210: ESCAPED_CHAR
                {
                mESCAPED_CHAR(); 

                }
                break;
            case 33 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:223: BYTE_VALUE
                {
                mBYTE_VALUE(); 

                }
                break;
            case 34 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:234: UNICODE_VALUE
                {
                mUNICODE_VALUE(); 

                }
                break;
            case 35 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:248: CHAR_LIT
                {
                mCHAR_LIT(); 

                }
                break;
            case 36 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:257: INTERPRETED_STRING_LIT
                {
                mINTERPRETED_STRING_LIT(); 

                }
                break;
            case 37 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:280: RAW_STRING_LIT
                {
                mRAW_STRING_LIT(); 

                }
                break;
            case 38 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:295: STRING_LIT
                {
                mSTRING_LIT(); 

                }
                break;
            case 39 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:306: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 40 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:314: WS
                {
                mWS(); 

                }
                break;
            case 41 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:317: PLUS
                {
                mPLUS(); 

                }
                break;
            case 42 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:322: MINUS
                {
                mMINUS(); 

                }
                break;
            case 43 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:328: MULTIPLY
                {
                mMULTIPLY(); 

                }
                break;
            case 44 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:337: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 45 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:344: MODULUS
                {
                mMODULUS(); 

                }
                break;
            case 46 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:352: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 47 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:362: BOR
                {
                mBOR(); 

                }
                break;
            case 48 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:366: BXOR
                {
                mBXOR(); 

                }
                break;
            case 49 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:371: BSHIFTL
                {
                mBSHIFTL(); 

                }
                break;
            case 50 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:379: BSHIFTR
                {
                mBSHIFTR(); 

                }
                break;
            case 51 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:387: BANDNOT
                {
                mBANDNOT(); 

                }
                break;
            case 52 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:395: AND
                {
                mAND(); 

                }
                break;
            case 53 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:399: OR
                {
                mOR(); 

                }
                break;
            case 54 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:402: CHANOP
                {
                mCHANOP(); 

                }
                break;
            case 55 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:409: INCR
                {
                mINCR(); 

                }
                break;
            case 56 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:414: DECR
                {
                mDECR(); 

                }
                break;
            case 57 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:419: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 58 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:425: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 59 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:434: NOT
                {
                mNOT(); 

                }
                break;
            case 60 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:438: LGT
                {
                mLGT(); 

                }
                break;
            case 61 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:442: SMT
                {
                mSMT(); 

                }
                break;
            case 62 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:446: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 63 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:453: ASSIGNINIT
                {
                mASSIGNINIT(); 

                }
                break;
            case 64 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:464: PLUSASSIGN
                {
                mPLUSASSIGN(); 

                }
                break;
            case 65 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:475: MINUSASSIGN
                {
                mMINUSASSIGN(); 

                }
                break;
            case 66 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:487: MULTIPLYASSIGN
                {
                mMULTIPLYASSIGN(); 

                }
                break;
            case 67 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:502: DIVIDEASSIGN
                {
                mDIVIDEASSIGN(); 

                }
                break;
            case 68 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:515: MODASSIGN
                {
                mMODASSIGN(); 

                }
                break;
            case 69 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:525: BANDASSIGN
                {
                mBANDASSIGN(); 

                }
                break;
            case 70 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:536: BORASSIGN
                {
                mBORASSIGN(); 

                }
                break;
            case 71 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:546: BXORASSIGN
                {
                mBXORASSIGN(); 

                }
                break;
            case 72 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:557: BSHIFTLASSIGN
                {
                mBSHIFTLASSIGN(); 

                }
                break;
            case 73 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:571: BSHIFTRASSIGN
                {
                mBSHIFTRASSIGN(); 

                }
                break;
            case 74 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:585: BANDNOTASSIGN
                {
                mBANDNOTASSIGN(); 

                }
                break;
            case 75 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:599: SMTOREQUAL
                {
                mSMTOREQUAL(); 

                }
                break;
            case 76 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:610: LGTOREQUAL
                {
                mLGTOREQUAL(); 

                }
                break;
            case 77 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:621: BRACEOPEN
                {
                mBRACEOPEN(); 

                }
                break;
            case 78 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:631: BRACECLOSE
                {
                mBRACECLOSE(); 

                }
                break;
            case 79 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:642: SQBRACEOPEN
                {
                mSQBRACEOPEN(); 

                }
                break;
            case 80 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:654: SQBRACECLOSE
                {
                mSQBRACECLOSE(); 

                }
                break;
            case 81 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:667: RBRACEOPEN
                {
                mRBRACEOPEN(); 

                }
                break;
            case 82 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:678: RBRACECLOSE
                {
                mRBRACECLOSE(); 

                }
                break;
            case 83 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:690: SLICE
                {
                mSLICE(); 

                }
                break;
            case 84 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:696: SELECTOR
                {
                mSELECTOR(); 

                }
                break;
            case 85 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:705: PARAMS
                {
                mPARAMS(); 

                }
                break;
            case 86 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:712: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 87 :
                // /Users/bloodsplatter/Projects/GoSupport/GoLexer.g:1:718: SEPARATOR
                {
                mSEPARATOR(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA14_eotS =
        "\6\uffff";
    static final String DFA14_eofS =
        "\6\uffff";
    static final String DFA14_minS =
        "\2\56\1\uffff\1\56\2\uffff";
    static final String DFA14_maxS =
        "\1\71\1\145\1\uffff\1\145\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\6\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\3\13\uffff\1\4\37\uffff\1\4",
            "",
            "\1\5\1\uffff\12\3\13\uffff\1\4\37\uffff\1\4",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "91:1: FLOAT_LIT : ( ( DECIMALS '.' ( DECIMALS )? ( EXPONENT )? ) | ( DECIMALS EXPONENT ) | ( '.' DECIMALS ( EXPONENT )? ) );";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\16\25\1\uffff\2\112\1\uffff\1\120\4\uffff\1\130\1\uffff"+
        "\1\133\1\136\1\140\1\142\1\145\1\151\1\153\1\157\1\162\1\165\1\167"+
        "\1\170\10\uffff\7\25\1\uffff\3\25\1\u0085\1\u0086\13\25\2\uffff"+
        "\1\111\2\uffff\1\112\1\uffff\1\112\1\u0099\2\uffff\1\124\4\uffff"+
        "\1\u009a\17\uffff\1\u009b\6\uffff\1\u009d\3\uffff\1\u009f\10\uffff"+
        "\10\25\1\u00aa\2\25\2\uffff\2\25\1\u00af\7\25\1\u00b7\17\uffff\1"+
        "\25\1\u00bf\1\u00c0\4\25\1\u00c5\1\25\1\uffff\1\25\1\u00c8\2\25"+
        "\1\uffff\6\25\1\u00d1\7\uffff\1\u00d9\2\uffff\1\u00da\2\25\1\u00dd"+
        "\1\uffff\1\25\1\u00df\1\uffff\3\25\1\u00e3\4\25\4\uffff\1\u00ea"+
        "\5\uffff\2\25\1\uffff\1\25\1\uffff\1\u00f0\2\25\1\uffff\1\u00f3"+
        "\1\u00f4\1\u00f5\1\u00f6\5\uffff\1\25\1\u00fc\1\25\1\uffff\1\25"+
        "\1\u00ff\10\uffff\1\u0103\1\uffff\2\25\5\uffff\1\25\1\u0109\2\uffff"+
        "\1\25\3\uffff\1\u010e\2\uffff";
    static final String DFA26_eofS =
        "\u010f\uffff";
    static final String DFA26_minS =
        "\1\11\1\162\1\141\1\145\1\53\1\141\1\157\1\146\3\141\1\145\1\171"+
        "\1\141\1\53\1\0\2\56\1\uffff\1\56\1\42\2\uffff\1\101\1\52\1\uffff"+
        "\1\53\1\55\2\75\1\46\2\75\1\55\4\75\10\uffff\1\145\1\163\1\141\1"+
        "\156\1\146\1\163\1\60\1\uffff\1\154\1\162\1\156\2\60\1\160\1\164"+
        "\1\160\1\143\1\156\1\164\1\154\1\162\1\151\1\160\1\162\1\42\1\0"+
        "\1\42\2\uffff\1\56\1\uffff\2\56\2\uffff\1\60\3\uffff\1\101\1\42"+
        "\17\uffff\1\75\6\uffff\1\75\3\uffff\1\75\10\uffff\1\141\1\145\1"+
        "\156\1\163\1\141\1\145\1\60\1\154\1\60\1\143\1\157\2\uffff\1\157"+
        "\1\145\1\60\1\153\1\147\1\165\1\145\1\165\1\164\1\145\1\60\1\0\2"+
        "\60\1\0\1\60\1\0\11\uffff\1\153\2\60\1\164\1\151\1\165\1\162\1\60"+
        "\1\164\1\uffff\1\164\1\60\2\162\1\uffff\1\141\1\145\1\162\3\143"+
        "\1\60\1\uffff\1\0\2\60\1\0\1\42\1\0\1\60\2\uffff\1\60\1\156\1\154"+
        "\1\60\1\uffff\1\150\1\60\1\uffff\1\164\1\146\1\147\1\60\1\156\2"+
        "\164\1\150\1\uffff\2\60\1\0\2\42\1\60\1\0\2\uffff\1\165\1\164\1"+
        "\uffff\1\162\1\uffff\1\60\1\141\1\145\1\uffff\6\60\1\uffff\2\60"+
        "\1\145\1\60\1\157\1\uffff\1\143\1\60\4\uffff\1\0\2\60\1\42\1\60"+
        "\1\uffff\1\165\1\145\1\uffff\2\60\1\42\1\uffff\1\147\3\60\1\150"+
        "\1\uffff\1\60\1\42\1\60\1\42\1\uffff";
    static final String DFA26_maxS =
        "\1\175\1\162\1\157\1\145\1\154\1\165\1\157\1\156\2\141\1\145\1\167"+
        "\1\171\1\141\1\71\1\uffff\2\145\1\uffff\1\71\1\166\2\uffff\1\172"+
        "\1\75\1\uffff\4\75\1\136\1\174\2\75\1\76\3\75\10\uffff\1\145\1\163"+
        "\1\141\1\156\1\146\1\163\1\71\1\uffff\1\154\1\162\1\156\2\172\1"+
        "\160\1\164\1\160\1\143\1\156\1\164\1\154\1\162\1\151\1\160\1\162"+
        "\1\165\1\uffff\1\140\2\uffff\1\145\1\uffff\2\145\2\uffff\1\146\3"+
        "\uffff\1\172\1\140\17\uffff\1\75\6\uffff\1\75\3\uffff\1\75\10\uffff"+
        "\1\141\1\145\1\156\1\164\2\145\1\71\1\154\1\172\1\143\1\157\2\uffff"+
        "\1\157\1\145\1\172\1\153\1\147\1\165\1\145\1\165\1\164\1\145\1\172"+
        "\1\uffff\2\146\1\uffff\1\146\1\uffff\11\uffff\1\153\2\172\1\164"+
        "\1\151\1\165\1\162\1\172\1\164\1\uffff\1\164\1\172\2\162\1\uffff"+
        "\1\141\1\145\1\162\3\143\1\172\1\uffff\1\uffff\2\146\1\uffff\1\172"+
        "\1\uffff\1\172\2\uffff\1\172\1\156\1\154\1\172\1\uffff\1\150\1\172"+
        "\1\uffff\1\164\1\146\1\147\1\172\1\156\2\164\1\150\1\uffff\2\146"+
        "\1\uffff\1\140\1\172\1\165\1\uffff\2\uffff\1\165\1\164\1\uffff\1"+
        "\162\1\uffff\1\172\1\141\1\145\1\uffff\4\172\2\146\1\uffff\2\146"+
        "\1\145\1\172\1\157\1\uffff\1\143\1\172\4\uffff\1\uffff\2\146\2\172"+
        "\1\uffff\1\165\1\145\1\uffff\2\146\1\172\1\uffff\1\147\1\172\2\146"+
        "\1\150\1\uffff\1\146\3\172\1\uffff";
    static final String DFA26_acceptS =
        "\22\uffff\1\32\2\uffff\1\32\1\43\2\uffff\1\50\14\uffff\1\115\1\116"+
        "\1\117\1\120\1\121\1\122\1\126\1\127\7\uffff\1\36\23\uffff\1\33"+
        "\1\34\1\uffff\1\37\2\uffff\1\125\1\124\1\uffff\1\42\1\41\1\40\2"+
        "\uffff\1\47\1\54\1\103\1\67\1\51\1\100\1\70\1\52\1\101\1\53\1\102"+
        "\1\55\1\104\1\64\1\56\1\uffff\1\105\1\65\1\57\1\106\1\60\1\107\1"+
        "\uffff\1\66\1\75\1\113\1\uffff\1\74\1\114\1\71\1\76\1\72\1\73\1"+
        "\123\1\77\13\uffff\1\14\1\16\21\uffff\1\46\1\35\1\45\1\63\1\112"+
        "\1\61\1\110\1\62\1\111\11\uffff\1\12\4\uffff\1\21\7\uffff\1\31\7"+
        "\uffff\1\2\1\3\4\uffff\1\10\2\uffff\1\15\10\uffff\1\30\7\uffff\1"+
        "\1\1\4\2\uffff\1\7\1\uffff\1\13\3\uffff\1\23\6\uffff\1\44\5\uffff"+
        "\1\17\2\uffff\1\24\1\25\1\26\1\27\5\uffff\1\6\2\uffff\1\22\3\uffff"+
        "\1\5\5\uffff\1\20\4\uffff\1\11";
    static final String DFA26_specialS =
        "\17\uffff\1\5\67\uffff\1\10\112\uffff\1\11\2\uffff\1\2\1\uffff\1"+
        "\4\40\uffff\1\12\2\uffff\1\1\1\uffff\1\7\26\uffff\1\3\3\uffff\1"+
        "\0\36\uffff\1\6\27\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\44\1\17\2\uffff\1\35\1\36"+
            "\1\26\1\46\1\47\1\34\1\32\1\54\1\33\1\23\1\30\1\21\11\20\1\45"+
            "\1\55\1\41\1\43\1\42\2\uffff\4\22\1\16\25\22\1\50\1\24\1\51"+
            "\1\40\1\25\1\27\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\22\1\7\3\22\1"+
            "\10\2\22\1\11\1\22\1\12\1\13\1\14\1\22\1\15\4\22\1\52\1\37\1"+
            "\53",
            "\1\56",
            "\1\57\6\uffff\1\60\6\uffff\1\61",
            "\1\62",
            "\1\65\1\uffff\1\65\2\uffff\12\64\62\uffff\1\63",
            "\1\66\15\uffff\1\67\5\uffff\1\70",
            "\1\71",
            "\1\72\6\uffff\1\73\1\74",
            "\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100",
            "\1\101\16\uffff\1\102\2\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\65\1\uffff\1\65\2\uffff\12\64",
            "\42\111\1\110\36\111\32\107\1\111\1\106\4\111\32\107\uff85"+
            "\111",
            "\1\114\1\uffff\12\113\13\uffff\1\114\37\uffff\1\114",
            "\1\114\1\uffff\10\115\2\116\13\uffff\1\114\37\uffff\1\114",
            "",
            "\1\117\1\uffff\12\114",
            "\1\124\4\uffff\1\124\10\uffff\12\123\7\uffff\6\123\16\uffff"+
            "\1\122\6\uffff\1\124\4\uffff\2\121\3\123\1\121\7\uffff\1\124"+
            "\3\uffff\1\124\1\uffff\1\124\1\122\1\124",
            "",
            "",
            "\32\125\5\uffff\1\126\32\125",
            "\1\127\4\uffff\1\127\15\uffff\1\131",
            "",
            "\1\132\21\uffff\1\134",
            "\1\135\17\uffff\1\137",
            "\1\141",
            "\1\143",
            "\1\144\26\uffff\1\147\40\uffff\1\146",
            "\1\152\76\uffff\1\150",
            "\1\154",
            "\1\156\16\uffff\1\155\1\160",
            "\1\163\1\161",
            "\1\164",
            "\1\166",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\u0084\6\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\111\4\uffff\1\111\10\uffff\4\u0095\4\u0097\2\u0096\7\uffff"+
            "\6\u0096\16\uffff\1\u0094\6\uffff\1\111\4\uffff\1\u0096\1\u0092"+
            "\3\u0096\1\u0092\7\uffff\1\111\3\uffff\1\111\1\uffff\1\111\1"+
            "\u0093",
            "\42\111\1\110\36\111\32\107\1\111\1\106\4\111\32\107\uff85"+
            "\111",
            "\1\u0098\75\uffff\1\u0098",
            "",
            "",
            "\1\114\1\uffff\12\113\13\uffff\1\114\37\uffff\1\114",
            "",
            "\1\114\1\uffff\10\115\2\116\13\uffff\1\114\37\uffff\1\114",
            "\1\114\1\uffff\12\116\13\uffff\1\114\37\uffff\1\114",
            "",
            "",
            "\12\123\7\uffff\6\123\32\uffff\6\123",
            "",
            "",
            "",
            "\32\125\5\uffff\1\126\32\125",
            "\1\u0098\75\uffff\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "\1\u00a0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\1\u00a5",
            "\1\u00a6\3\uffff\1\u00a7",
            "\1\u00a8",
            "\12\u0080",
            "\1\u00a9",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\60\111\12\u00b8\7\111\6\u00b8\32\111\6\u00b8\uff99\111",
            "\12\u00b9\7\uffff\6\u00b9\32\uffff\6\u00b9",
            "\12\u00ba\7\uffff\6\u00ba\32\uffff\6\u00ba",
            "\60\111\10\u00bb\2\u00b8\7\111\6\u00b8\32\111\6\u00b8\uff99"+
            "\111",
            "\12\u00bc\7\uffff\6\u00bc\32\uffff\6\u00bc",
            "\60\111\10\u00bd\2\u00b8\7\111\6\u00b8\32\111\6\u00b8\uff99"+
            "\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\42\111\1\110\36\111\32\107\1\111\1\106\4\111\32\107\uff85"+
            "\111",
            "\12\u00d2\7\uffff\6\u00d2\32\uffff\6\u00d2",
            "\12\u00d3\7\uffff\6\u00d3\32\uffff\6\u00d3",
            "\42\111\1\110\15\111\10\u00d4\11\111\32\107\1\111\1\106\4\111"+
            "\32\107\uff85\111",
            "\1\u00d5\36\uffff\32\u00d6\1\uffff\1\u00d7\4\uffff\32\u00d6",
            "\42\111\1\110\15\111\10\u00d8\11\111\32\107\1\111\1\106\4\111"+
            "\32\107\uff85\111",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00db",
            "\1\u00dc",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u00de",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\12\u00e8\7\uffff\6\u00e8\32\uffff\6\u00e8",
            "\12\u00e9\7\uffff\6\u00e9\32\uffff\6\u00e9",
            "\42\111\1\110\36\111\32\107\1\111\1\106\4\111\32\107\uff85"+
            "\111",
            "\1\u0098\75\uffff\1\u0098",
            "\1\u00d5\36\uffff\32\u00d6\1\uffff\1\u00d7\4\uffff\32\u00d6",
            "\10\u00ec\2\u0096\7\uffff\6\u0096\16\uffff\1\u0094\13\uffff"+
            "\6\u0096\16\uffff\1\u00eb",
            "\42\111\1\110\36\111\32\107\1\111\1\106\4\111\32\107\uff85"+
            "\111",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\u00f7\7\uffff\6\u00f7\32\uffff\6\u00f7",
            "\12\u00f8\7\uffff\6\u00f8\32\uffff\6\u00f8",
            "",
            "\12\u00f9\7\uffff\6\u00f9\32\uffff\6\u00f9",
            "\10\u00fa\2\u00bc\7\uffff\6\u00bc\32\uffff\6\u00bc",
            "\1\u00fb",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "\42\111\1\110\36\111\32\107\1\111\1\106\4\111\32\107\uff85"+
            "\111",
            "\12\u0100\7\uffff\6\u0100\32\uffff\6\u0100",
            "\12\u0101\7\uffff\6\u0101\32\uffff\6\u0101",
            "\1\u00d5\15\uffff\10\u0102\11\uffff\32\u00d6\1\uffff\1\u00d7"+
            "\4\uffff\32\u00d6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0104",
            "\1\u0105",
            "",
            "\12\u0106\7\uffff\6\u0106\32\uffff\6\u0106",
            "\12\u0107\7\uffff\6\u0107\32\uffff\6\u0107",
            "\1\u00d5\36\uffff\32\u00d6\1\uffff\1\u00d7\4\uffff\32\u00d6",
            "",
            "\1\u0108",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\u010a\7\uffff\6\u010a\32\uffff\6\u010a",
            "\12\u010b\7\uffff\6\u010b\32\uffff\6\u010b",
            "\1\u010c",
            "",
            "\12\u010d\7\uffff\6\u010d\32\uffff\6\u010d",
            "\1\u00d5\36\uffff\32\u00d6\1\uffff\1\u00d7\4\uffff\32\u00d6",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u00d5\36\uffff\32\u00d6\1\uffff\1\u00d7\4\uffff\32\u00d6",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BREAK | CASE | CHAN | CONST | CONTINUE | DEFAULT | DEFER | ELSE | FALLTHROUGH | FOR | FUNC | GO | GOTO | IF | IMPORT | INTERFACE | MAP | PACKAGE | RANGE | RETURN | SELECT | STRUCT | SWITCH | TYPE | VAR | ID | STRING | INT_LIT | DECIMALS | EXPONENT | FLOAT_LIT | ESCAPED_CHAR | BYTE_VALUE | UNICODE_VALUE | CHAR_LIT | INTERPRETED_STRING_LIT | RAW_STRING_LIT | STRING_LIT | COMMENT | WS | PLUS | MINUS | MULTIPLY | DIVIDE | MODULUS | AMPERSAND | BOR | BXOR | BSHIFTL | BSHIFTR | BANDNOT | AND | OR | CHANOP | INCR | DECR | EQUAL | NOTEQUAL | NOT | LGT | SMT | ASSIGN | ASSIGNINIT | PLUSASSIGN | MINUSASSIGN | MULTIPLYASSIGN | DIVIDEASSIGN | MODASSIGN | BANDASSIGN | BORASSIGN | BXORASSIGN | BSHIFTLASSIGN | BSHIFTRASSIGN | BANDNOTASSIGN | SMTOREQUAL | LGTOREQUAL | BRACEOPEN | BRACECLOSE | SQBRACEOPEN | SQBRACECLOSE | RBRACEOPEN | RBRACECLOSE | SLICE | SELECTOR | PARAMS | COMMA | SEPARATOR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_216 = input.LA(1);

                        s = -1;
                        if ( (LA26_216=='\"') ) {s = 72;}

                        else if ( (LA26_216=='\\') ) {s = 70;}

                        else if ( ((LA26_216>='A' && LA26_216<='Z')||(LA26_216>='a' && LA26_216<='z')) ) {s = 71;}

                        else if ( ((LA26_216>='\u0000' && LA26_216<='!')||(LA26_216>='#' && LA26_216<='@')||LA26_216=='['||(LA26_216>=']' && LA26_216<='`')||(LA26_216>='{' && LA26_216<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_187 = input.LA(1);

                        s = -1;
                        if ( ((LA26_187>='0' && LA26_187<='7')) ) {s = 212;}

                        else if ( (LA26_187=='\"') ) {s = 72;}

                        else if ( (LA26_187=='\\') ) {s = 70;}

                        else if ( ((LA26_187>='A' && LA26_187<='Z')||(LA26_187>='a' && LA26_187<='z')) ) {s = 71;}

                        else if ( ((LA26_187>='\u0000' && LA26_187<='!')||(LA26_187>='#' && LA26_187<='/')||(LA26_187>='8' && LA26_187<='@')||LA26_187=='['||(LA26_187>=']' && LA26_187<='`')||(LA26_187>='{' && LA26_187<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_149 = input.LA(1);

                        s = -1;
                        if ( ((LA26_149>='0' && LA26_149<='7')) ) {s = 187;}

                        else if ( ((LA26_149>='\u0000' && LA26_149<='/')||(LA26_149>=':' && LA26_149<='@')||(LA26_149>='G' && LA26_149<='`')||(LA26_149>='g' && LA26_149<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA26_149>='8' && LA26_149<='9')||(LA26_149>='A' && LA26_149<='F')||(LA26_149>='a' && LA26_149<='f')) ) {s = 184;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_212 = input.LA(1);

                        s = -1;
                        if ( (LA26_212=='\"') ) {s = 72;}

                        else if ( (LA26_212=='\\') ) {s = 70;}

                        else if ( ((LA26_212>='A' && LA26_212<='Z')||(LA26_212>='a' && LA26_212<='z')) ) {s = 71;}

                        else if ( ((LA26_212>='\u0000' && LA26_212<='!')||(LA26_212>='#' && LA26_212<='@')||LA26_212=='['||(LA26_212>=']' && LA26_212<='`')||(LA26_212>='{' && LA26_212<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_151 = input.LA(1);

                        s = -1;
                        if ( ((LA26_151>='0' && LA26_151<='7')) ) {s = 189;}

                        else if ( ((LA26_151>='\u0000' && LA26_151<='/')||(LA26_151>=':' && LA26_151<='@')||(LA26_151>='G' && LA26_151<='`')||(LA26_151>='g' && LA26_151<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA26_151>='8' && LA26_151<='9')||(LA26_151>='A' && LA26_151<='F')||(LA26_151>='a' && LA26_151<='f')) ) {s = 184;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_15 = input.LA(1);

                        s = -1;
                        if ( (LA26_15=='\\') ) {s = 70;}

                        else if ( ((LA26_15>='A' && LA26_15<='Z')||(LA26_15>='a' && LA26_15<='z')) ) {s = 71;}

                        else if ( (LA26_15=='\"') ) {s = 72;}

                        else if ( ((LA26_15>='\u0000' && LA26_15<='!')||(LA26_15>='#' && LA26_15<='@')||LA26_15=='['||(LA26_15>=']' && LA26_15<='`')||(LA26_15>='{' && LA26_15<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_247 = input.LA(1);

                        s = -1;
                        if ( (LA26_247=='\"') ) {s = 72;}

                        else if ( (LA26_247=='\\') ) {s = 70;}

                        else if ( ((LA26_247>='A' && LA26_247<='Z')||(LA26_247>='a' && LA26_247<='z')) ) {s = 71;}

                        else if ( ((LA26_247>='\u0000' && LA26_247<='!')||(LA26_247>='#' && LA26_247<='@')||LA26_247=='['||(LA26_247>=']' && LA26_247<='`')||(LA26_247>='{' && LA26_247<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_189 = input.LA(1);

                        s = -1;
                        if ( ((LA26_189>='0' && LA26_189<='7')) ) {s = 216;}

                        else if ( (LA26_189=='\"') ) {s = 72;}

                        else if ( (LA26_189=='\\') ) {s = 70;}

                        else if ( ((LA26_189>='A' && LA26_189<='Z')||(LA26_189>='a' && LA26_189<='z')) ) {s = 71;}

                        else if ( ((LA26_189>='\u0000' && LA26_189<='!')||(LA26_189>='#' && LA26_189<='/')||(LA26_189>='8' && LA26_189<='@')||LA26_189=='['||(LA26_189>=']' && LA26_189<='`')||(LA26_189>='{' && LA26_189<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_71 = input.LA(1);

                        s = -1;
                        if ( (LA26_71=='\"') ) {s = 72;}

                        else if ( (LA26_71=='\\') ) {s = 70;}

                        else if ( ((LA26_71>='A' && LA26_71<='Z')||(LA26_71>='a' && LA26_71<='z')) ) {s = 71;}

                        else if ( ((LA26_71>='\u0000' && LA26_71<='!')||(LA26_71>='#' && LA26_71<='@')||LA26_71=='['||(LA26_71>=']' && LA26_71<='`')||(LA26_71>='{' && LA26_71<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_146 = input.LA(1);

                        s = -1;
                        if ( ((LA26_146>='\u0000' && LA26_146<='/')||(LA26_146>=':' && LA26_146<='@')||(LA26_146>='G' && LA26_146<='`')||(LA26_146>='g' && LA26_146<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA26_146>='0' && LA26_146<='9')||(LA26_146>='A' && LA26_146<='F')||(LA26_146>='a' && LA26_146<='f')) ) {s = 184;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_184 = input.LA(1);

                        s = -1;
                        if ( (LA26_184=='\"') ) {s = 72;}

                        else if ( (LA26_184=='\\') ) {s = 70;}

                        else if ( ((LA26_184>='A' && LA26_184<='Z')||(LA26_184>='a' && LA26_184<='z')) ) {s = 71;}

                        else if ( ((LA26_184>='\u0000' && LA26_184<='!')||(LA26_184>='#' && LA26_184<='@')||LA26_184=='['||(LA26_184>=']' && LA26_184<='`')||(LA26_184>='{' && LA26_184<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
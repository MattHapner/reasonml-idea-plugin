/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.reason.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static reason.lang.RmlTypes.*;
import static com.intellij.psi.TokenType.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>ReasonML.flex</tt>
 */
public class ReasonMLLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;
  public static final int INITIAL = 4;
  public static final int IN_STRING = 6;
  public static final int IN_RML_COMMENT = 8;
  public static final int IN_OCL_COMMENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\112\1\1\1\114\1\3\1\2\22\0\1\112\1\75\1\57\1\103\1\105\1\110\1\63"+
    "\1\6\1\62\1\74\1\61\1\27\1\76\1\67\1\24\1\60\1\11\1\23\2\113\4\20\2\7\1\64"+
    "\1\77\1\71\1\65\1\66\1\104\1\102\1\15\1\22\2\15\1\26\1\15\7\5\1\54\1\17\1"+
    "\31\2\5\1\55\4\5\1\13\2\5\1\72\1\111\1\73\1\107\1\10\1\56\1\35\1\21\1\42\1"+
    "\37\1\25\1\14\1\52\1\47\1\41\1\50\1\4\1\36\1\32\1\40\1\16\1\30\1\4\1\44\1"+
    "\45\1\34\1\33\1\53\1\46\1\12\1\43\1\51\1\100\1\70\1\101\1\106\6\0\1\114\242"+
    "\0\2\114\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\1\2\1\3\1\4\1\5\1\6\2\7"+
    "\2\4\1\10\1\4\1\11\13\4\2\5\1\12\1\13"+
    "\1\14\1\15\1\16\1\2\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\2\1\45\4\44\1\46\1\7\1\47"+
    "\1\0\2\7\1\0\3\4\1\50\5\4\1\51\4\4"+
    "\1\52\3\4\1\53\3\4\1\54\1\55\1\56\7\4"+
    "\2\5\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
    "\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
    "\1\76\1\77\1\100\1\101\1\0\1\44\1\0\3\44"+
    "\1\102\1\103\2\47\1\0\3\7\1\104\1\105\6\4"+
    "\1\106\6\4\1\107\2\4\1\110\4\4\1\111\1\112"+
    "\2\4\1\113\2\4\1\114\2\5\1\115\1\116\3\0"+
    "\1\47\1\7\3\4\1\117\2\4\1\120\3\4\1\65"+
    "\1\121\1\122\1\123\1\4\1\124\1\125\1\126\4\4"+
    "\1\127\1\130\1\131\1\0\1\47\1\4\1\132\5\4"+
    "\1\133\2\4\1\134\3\4\1\135\1\136\1\4\1\137"+
    "\1\4\1\140\1\4\1\141\1\142\2\4\1\143\1\144"+
    "\1\145\1\146";

  private static int [] zzUnpackAction() {
    int [] result = new int[236];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\115\0\232\0\347\0\u0134\0\u0181\0\u01ce\0\u01ce"+
    "\0\u021b\0\u0268\0\u02b5\0\u0302\0\u034f\0\u039c\0\u03e9\0\u0436"+
    "\0\u01ce\0\u0483\0\u04d0\0\u051d\0\u056a\0\u05b7\0\u0604\0\u0651"+
    "\0\u069e\0\u06eb\0\u0738\0\u0785\0\u07d2\0\u081f\0\u086c\0\u08b9"+
    "\0\u0906\0\u01ce\0\u0953\0\u09a0\0\u09ed\0\u0a3a\0\u0a87\0\u0ad4"+
    "\0\u01ce\0\u0b21\0\u0b6e\0\u0bbb\0\u0c08\0\u01ce\0\u01ce\0\u0c55"+
    "\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u01ce"+
    "\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u0ca2\0\u01ce\0\u0cef\0\u0d3c"+
    "\0\u0d89\0\u0dd6\0\u0e23\0\u01ce\0\u0e70\0\u0ebd\0\u0f0a\0\u0f57"+
    "\0\u0fa4\0\u0ff1\0\u103e\0\u108b\0\u0268\0\u10d8\0\u1125\0\u1172"+
    "\0\u11bf\0\u120c\0\u01ce\0\u1259\0\u12a6\0\u12f3\0\u1340\0\u0268"+
    "\0\u138d\0\u13da\0\u1427\0\u1474\0\u14c1\0\u150e\0\u155b\0\u15a8"+
    "\0\u0268\0\u15f5\0\u1642\0\u168f\0\u16dc\0\u1729\0\u1776\0\u17c3"+
    "\0\u1810\0\u185d\0\u18aa\0\u18f7\0\u01ce\0\u01ce\0\u01ce\0\u01ce"+
    "\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u1944\0\u01ce\0\u01ce\0\u01ce"+
    "\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u01ce\0\u1991\0\u0ca2\0\u19de"+
    "\0\u1a2b\0\u1a78\0\u1ac5\0\u1b12\0\u01ce\0\u01ce\0\u01ce\0\u1b5f"+
    "\0\u1bac\0\u1bf9\0\u1c46\0\u1c93\0\u0268\0\u1ce0\0\u1d2d\0\u1d7a"+
    "\0\u1dc7\0\u1e14\0\u1e61\0\u1eae\0\u0268\0\u1efb\0\u1f48\0\u1f95"+
    "\0\u1fe2\0\u202f\0\u207c\0\u0268\0\u20c9\0\u2116\0\u0268\0\u2163"+
    "\0\u21b0\0\u21fd\0\u224a\0\u0268\0\u0268\0\u2297\0\u22e4\0\u0268"+
    "\0\u2331\0\u237e\0\u0268\0\u23cb\0\u2418\0\u01ce\0\u01ce\0\u2465"+
    "\0\u24b2\0\u24ff\0\u254c\0\u0ebd\0\u2599\0\u25e6\0\u2633\0\u0268"+
    "\0\u2680\0\u26cd\0\u0268\0\u271a\0\u2767\0\u27b4\0\u0268\0\u0268"+
    "\0\u0268\0\u0268\0\u2801\0\u0268\0\u0268\0\u0268\0\u284e\0\u289b"+
    "\0\u28e8\0\u2935\0\u0268\0\u02b5\0\u02b5\0\u2982\0\u0ebd\0\u29cf"+
    "\0\u0268\0\u2a1c\0\u2a69\0\u2ab6\0\u2b03\0\u2b50\0\u0268\0\u2b9d"+
    "\0\u2bea\0\u0268\0\u2c37\0\u2c84\0\u2cd1\0\u0268\0\u0268\0\u2d1e"+
    "\0\u0268\0\u2d6b\0\u0268\0\u2db8\0\u0268\0\u0268\0\u2e05\0\u2e52"+
    "\0\u0268\0\u0268\0\u0268\0\u0268";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[236];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\115\7\116\10\3\11\1\12\1\13\1\14\1\15\1\12"+
    "\1\16\1\12\1\13\1\17\1\13\1\20\1\13\1\15"+
    "\1\12\1\13\1\15\1\21\1\22\1\13\1\23\1\12"+
    "\1\13\1\24\1\25\1\26\1\27\1\30\1\31\1\12"+
    "\1\32\2\12\1\33\1\34\1\35\4\12\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
    "\1\70\1\71\1\72\1\73\1\10\1\11\1\15\1\10"+
    "\2\74\1\75\1\10\53\74\1\76\31\74\1\77\2\74"+
    "\1\10\2\74\1\75\1\10\54\74\1\100\1\101\32\74"+
    "\1\10\2\74\1\75\1\10\55\74\1\102\1\100\31\74"+
    "\1\10\116\0\3\11\106\0\1\11\6\0\20\12\1\0"+
    "\2\12\1\0\26\12\35\0\1\12\5\0\20\13\1\0"+
    "\2\13\1\0\26\13\35\0\1\13\5\0\1\103\3\0"+
    "\1\103\1\0\1\103\1\0\1\103\1\0\1\103\2\0"+
    "\1\103\3\0\1\103\2\0\1\103\1\0\22\103\45\0"+
    "\2\104\1\0\3\15\2\104\2\0\2\104\1\15\2\0"+
    "\1\15\1\105\2\106\1\0\5\104\1\0\1\104\1\0"+
    "\2\104\1\0\13\104\35\0\1\15\5\0\2\104\1\0"+
    "\3\15\2\107\2\0\2\110\1\15\2\111\1\15\1\105"+
    "\2\106\1\0\5\104\1\0\1\104\1\0\2\104\1\0"+
    "\13\104\35\0\1\15\5\0\12\12\1\112\5\12\1\0"+
    "\2\12\1\0\3\12\1\113\1\12\1\114\20\12\35\0"+
    "\1\12\5\0\10\12\1\115\4\12\1\116\2\12\1\0"+
    "\2\12\1\0\1\117\25\12\35\0\1\12\5\0\6\12"+
    "\1\120\11\12\1\0\2\12\1\0\6\12\1\121\1\12"+
    "\1\122\15\12\35\0\1\12\25\0\1\123\74\0\12\12"+
    "\1\124\5\12\1\0\2\12\1\0\3\12\1\125\1\12"+
    "\1\126\20\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\10\12\1\127\15\12\35\0\1\12\5\0\12\12"+
    "\1\130\5\12\1\0\2\12\1\0\13\12\1\131\1\132"+
    "\2\12\1\133\6\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\15\12\1\134\10\12\35\0\1\12\5\0"+
    "\20\12\1\0\1\135\1\12\1\0\5\12\1\136\3\12"+
    "\1\137\14\12\35\0\1\12\5\0\12\12\1\140\5\12"+
    "\1\0\2\12\1\0\26\12\35\0\1\12\5\0\10\12"+
    "\1\141\7\12\1\0\2\12\1\0\10\12\1\142\15\12"+
    "\35\0\1\12\5\0\20\12\1\0\1\143\1\12\1\0"+
    "\5\12\1\144\20\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\4\12\1\145\4\12\1\146\4\12\1\147"+
    "\7\12\35\0\1\12\5\0\20\12\1\0\2\12\1\0"+
    "\11\12\1\150\14\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\5\12\1\151\20\12\35\0\1\12\5\0"+
    "\12\13\1\152\5\13\1\0\2\13\1\0\26\13\35\0"+
    "\1\13\5\0\12\13\1\153\5\13\1\0\2\13\1\0"+
    "\26\13\35\0\1\13\6\0\1\154\5\0\1\154\1\0"+
    "\1\154\1\0\1\154\2\0\1\154\3\0\1\154\2\0"+
    "\1\154\22\0\2\154\63\0\1\155\34\0\1\156\4\0"+
    "\1\157\52\0\1\160\151\0\1\161\12\0\1\162\103\0"+
    "\1\163\115\0\1\164\115\0\1\165\1\166\52\0\1\167"+
    "\41\0\1\170\114\0\1\171\4\0\1\172\101\0\1\173"+
    "\5\0\1\174\116\0\1\175\111\0\1\176\30\0\1\74"+
    "\1\177\112\0\1\74\1\200\1\201\1\0\3\74\1\202"+
    "\1\74\1\202\1\203\3\74\1\204\1\74\1\202\2\74"+
    "\1\202\67\74\1\202\62\0\1\205\113\0\1\206\130\0"+
    "\1\206\24\0\20\103\1\0\2\103\1\0\26\103\35\0"+
    "\1\103\5\0\2\207\1\0\3\105\2\207\2\0\2\207"+
    "\1\105\2\0\1\105\1\0\2\106\1\0\5\207\1\0"+
    "\1\207\1\0\2\207\1\0\13\207\35\0\1\105\10\0"+
    "\1\210\1\0\1\210\6\0\1\210\2\0\1\210\3\0"+
    "\1\211\37\0\1\211\23\0\1\210\10\0\1\212\1\0"+
    "\1\212\2\0\2\212\2\0\4\212\1\0\2\212\6\0"+
    "\1\212\1\0\1\212\2\0\1\212\50\0\1\212\12\0"+
    "\1\213\6\0\1\213\2\0\1\213\67\0\1\213\12\0"+
    "\1\214\11\0\1\214\75\0\20\12\1\0\2\12\1\0"+
    "\14\12\1\215\11\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\10\12\1\216\15\12\35\0\1\12\5\0"+
    "\20\12\1\0\2\12\1\0\6\12\1\217\17\12\35\0"+
    "\1\12\5\0\20\12\1\0\2\12\1\0\20\12\1\220"+
    "\5\12\35\0\1\12\5\0\20\12\1\0\1\221\1\12"+
    "\1\0\4\12\1\222\21\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\4\12\1\223\21\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\15\12\1\224\10\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\7\12"+
    "\1\225\16\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\7\12\1\226\16\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\4\12\1\227\21\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\4\12\1\230\21\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\11\12"+
    "\1\231\14\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\1\232\25\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\3\12\1\233\7\12\1\234\12\12\35\0"+
    "\1\12\5\0\20\12\1\0\1\235\1\12\1\0\26\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\15\12"+
    "\1\236\10\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\4\12\1\237\21\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\21\12\1\240\4\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\15\12\1\241\10\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\10\12"+
    "\1\242\15\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\12\12\1\243\13\12\35\0\1\12\5\0\10\12"+
    "\1\244\7\12\1\0\2\12\1\0\12\12\1\245\13\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\11\12"+
    "\1\246\14\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\14\12\1\247\11\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\22\12\1\250\3\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\11\12\1\251\14\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\4\12"+
    "\1\252\21\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\6\12\1\253\17\12\35\0\1\12\5\0\20\13"+
    "\1\0\2\13\1\0\10\13\1\254\15\13\35\0\1\13"+
    "\5\0\20\13\1\0\2\13\1\0\2\13\1\255\23\13"+
    "\35\0\1\13\5\0\20\154\1\0\2\154\1\0\26\154"+
    "\35\0\1\154\66\0\1\256\114\0\1\257\141\0\1\200"+
    "\3\0\1\200\1\201\121\0\1\260\1\0\1\260\6\0"+
    "\1\260\2\0\1\260\67\0\1\260\10\0\1\261\1\0"+
    "\1\261\2\0\2\261\2\0\4\261\1\0\2\261\6\0"+
    "\1\261\1\0\1\261\2\0\1\261\50\0\1\261\12\0"+
    "\1\262\11\0\1\262\67\0\1\262\5\0\2\207\1\0"+
    "\3\210\2\207\2\0\2\207\1\210\2\0\1\210\4\0"+
    "\5\207\1\0\1\207\1\0\2\207\1\0\13\207\35\0"+
    "\1\210\10\0\1\210\1\0\1\210\6\0\1\210\2\0"+
    "\1\210\67\0\1\210\5\0\2\104\1\0\3\212\2\104"+
    "\2\212\2\104\4\212\1\263\2\212\1\0\2\264\3\104"+
    "\1\212\1\104\1\212\2\104\1\212\13\104\35\0\1\212"+
    "\5\0\2\104\2\0\2\213\2\104\2\0\2\104\1\213"+
    "\2\0\1\213\4\0\5\104\1\0\1\104\1\0\2\104"+
    "\1\0\13\104\35\0\1\213\5\0\2\104\2\0\2\214"+
    "\2\104\2\0\2\104\3\0\1\214\4\0\5\104\1\0"+
    "\1\104\1\0\2\104\1\0\13\104\43\0\20\12\1\0"+
    "\2\12\1\0\12\12\1\265\13\12\35\0\1\12\5\0"+
    "\20\12\1\0\2\12\1\0\15\12\1\266\10\12\35\0"+
    "\1\12\5\0\20\12\1\0\1\267\1\12\1\0\26\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\10\12"+
    "\1\270\15\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\11\12\1\271\14\12\35\0\1\12\5\0\20\12"+
    "\1\0\1\272\1\12\1\0\26\12\35\0\1\12\5\0"+
    "\20\12\1\0\1\273\1\12\1\0\26\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\3\12\1\274\22\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\5\12"+
    "\1\275\20\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\12\12\1\276\13\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\4\12\1\277\21\12\35\0\1\12"+
    "\5\0\20\12\1\0\1\300\1\12\1\0\26\12\35\0"+
    "\1\12\5\0\20\12\1\0\1\301\1\12\1\0\26\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\10\12"+
    "\1\302\15\12\35\0\1\12\5\0\20\12\1\0\1\303"+
    "\1\12\1\0\26\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\13\12\1\304\12\12\35\0\1\12\5\0"+
    "\20\12\1\0\2\12\1\0\4\12\1\305\21\12\35\0"+
    "\1\12\5\0\20\12\1\0\1\306\1\12\1\0\26\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\6\12"+
    "\1\307\17\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\15\12\1\310\10\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\3\12\1\311\22\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\4\12\1\312\21\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\17\12"+
    "\1\313\6\12\35\0\1\12\5\0\20\13\1\0\1\314"+
    "\1\13\1\0\26\13\35\0\1\13\5\0\20\13\1\0"+
    "\1\315\1\13\1\0\26\13\35\0\1\13\10\0\1\74"+
    "\1\0\1\74\6\0\1\74\2\0\1\74\67\0\1\74"+
    "\10\0\1\74\1\0\1\74\2\0\2\74\2\0\4\74"+
    "\1\0\2\74\6\0\1\74\1\0\1\74\2\0\1\74"+
    "\50\0\1\74\12\0\1\316\6\0\1\316\2\0\1\316"+
    "\67\0\1\316\5\0\2\207\1\0\3\263\2\207\2\263"+
    "\2\207\4\263\1\0\2\263\1\0\2\317\3\207\1\263"+
    "\1\207\1\263\2\207\1\263\13\207\35\0\1\263\5\0"+
    "\20\12\1\0\2\12\1\0\4\12\1\320\21\12\35\0"+
    "\1\12\5\0\20\12\1\0\1\321\1\12\1\0\26\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\12\12"+
    "\1\322\13\12\35\0\1\12\5\0\12\12\1\323\5\12"+
    "\1\0\2\12\1\0\26\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\14\12\1\324\11\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\6\12\1\325\17\12"+
    "\35\0\1\12\5\0\15\12\1\326\2\12\1\0\2\12"+
    "\1\0\26\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\17\12\1\327\6\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\14\12\1\330\11\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\3\12\1\331\22\12"+
    "\35\0\1\12\5\0\20\12\1\0\1\332\1\12\1\0"+
    "\26\12\35\0\1\12\5\0\20\12\1\0\2\12\1\0"+
    "\12\12\1\333\13\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\12\12\1\334\13\12\35\0\1\12\12\0"+
    "\1\74\6\0\1\74\2\0\1\74\67\0\1\74\5\0"+
    "\20\12\1\0\2\12\1\0\11\12\1\335\14\12\35\0"+
    "\1\12\5\0\20\12\1\0\2\12\1\0\4\12\1\336"+
    "\21\12\35\0\1\12\5\0\20\12\1\0\2\12\1\0"+
    "\10\12\1\337\15\12\35\0\1\12\5\0\20\12\1\0"+
    "\2\12\1\0\10\12\1\340\15\12\35\0\1\12\5\0"+
    "\20\12\1\0\1\341\1\12\1\0\26\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\6\12\1\342\17\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\4\12"+
    "\1\343\21\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\7\12\1\344\16\12\35\0\1\12\5\0\20\12"+
    "\1\0\2\12\1\0\4\12\1\345\21\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\17\12\1\346\6\12"+
    "\35\0\1\12\5\0\12\12\1\347\5\12\1\0\2\12"+
    "\1\0\26\12\35\0\1\12\5\0\20\12\1\0\2\12"+
    "\1\0\5\12\1\350\20\12\35\0\1\12\5\0\20\12"+
    "\1\0\1\351\1\12\1\0\26\12\35\0\1\12\5\0"+
    "\20\12\1\0\1\352\1\12\1\0\26\12\35\0\1\12"+
    "\5\0\20\12\1\0\2\12\1\0\10\12\1\353\15\12"+
    "\35\0\1\12\5\0\20\12\1\0\2\12\1\0\6\12"+
    "\1\354\17\12\35\0\1\12\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11935];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\2\11\10\1\1\11\20\1\1\11\6\1\1\11"+
    "\4\1\2\11\1\1\14\11\1\1\1\11\5\1\1\11"+
    "\1\1\1\0\2\1\1\0\11\1\1\11\31\1\10\11"+
    "\1\1\10\11\1\1\1\0\1\1\1\0\3\1\3\11"+
    "\1\1\1\0\44\1\2\11\3\0\33\1\1\0\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[236];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private int tokenStartIndex;
  private CharSequence quotedStringId;
  private int commentDepth;

  //Store the start index of a token
  private void tokenStart() {
    tokenStartIndex = zzStartRead;
  }

  //Set the start index of the token to the stored index
  private void tokenEnd() {
    zzStartRead = tokenStartIndex;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public ReasonMLLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        switch (zzLexicalState) {
            case IN_STRING: {
              yybegin(INITIAL); tokenEnd(); return STRING;
            }  // fall though
            case 237: break;
            case IN_RML_COMMENT: {
              yybegin(INITIAL); tokenEnd(); return COMMENT;
            }  // fall though
            case 238: break;
            case IN_OCL_COMMENT: {
              yybegin(INITIAL); tokenEnd(); return COMMENT;
            }  // fall though
            case 239: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(INITIAL); yypushback(1);
            } 
            // fall through
          case 103: break;
          case 2: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 104: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 105: break;
          case 4: 
            { return LIDENT;
            } 
            // fall through
          case 106: break;
          case 5: 
            { return UIDENT;
            } 
            // fall through
          case 107: break;
          case 6: 
            { return QUOTE;
            } 
            // fall through
          case 108: break;
          case 7: 
            { return INT;
            } 
            // fall through
          case 109: break;
          case 8: 
            { return DOT;
            } 
            // fall through
          case 110: break;
          case 9: 
            { return PLUS;
            } 
            // fall through
          case 111: break;
          case 10: 
            { return BACKTICK;
            } 
            // fall through
          case 112: break;
          case 11: 
            { yybegin(IN_STRING); tokenStart();
            } 
            // fall through
          case 113: break;
          case 12: 
            { return SLASH;
            } 
            // fall through
          case 114: break;
          case 13: 
            { return STAR;
            } 
            // fall through
          case 115: break;
          case 14: 
            { return LPAREN;
            } 
            // fall through
          case 116: break;
          case 15: 
            { return COLON;
            } 
            // fall through
          case 117: break;
          case 16: 
            { return EQ;
            } 
            // fall through
          case 118: break;
          case 17: 
            { return GT;
            } 
            // fall through
          case 119: break;
          case 18: 
            { return MINUS;
            } 
            // fall through
          case 120: break;
          case 19: 
            { return PIPE;
            } 
            // fall through
          case 121: break;
          case 20: 
            { return LT;
            } 
            // fall through
          case 122: break;
          case 21: 
            { return LBRACKET;
            } 
            // fall through
          case 123: break;
          case 22: 
            { return RBRACKET;
            } 
            // fall through
          case 124: break;
          case 23: 
            { return RPAREN;
            } 
            // fall through
          case 125: break;
          case 24: 
            { return EXCLAMATION_MARK;
            } 
            // fall through
          case 126: break;
          case 25: 
            { return COMMA;
            } 
            // fall through
          case 127: break;
          case 26: 
            { return SEMI;
            } 
            // fall through
          case 128: break;
          case 27: 
            { return LBRACE;
            } 
            // fall through
          case 129: break;
          case 28: 
            { return RBRACE;
            } 
            // fall through
          case 130: break;
          case 29: 
            { return ARROBASE;
            } 
            // fall through
          case 131: break;
          case 30: 
            { return SHARP;
            } 
            // fall through
          case 132: break;
          case 31: 
            { return QUESTION_MARK;
            } 
            // fall through
          case 133: break;
          case 32: 
            { return DOLLAR;
            } 
            // fall through
          case 134: break;
          case 33: 
            { return TILDE;
            } 
            // fall through
          case 135: break;
          case 34: 
            { return CARRET;
            } 
            // fall through
          case 136: break;
          case 35: 
            { return PERCENT;
            } 
            // fall through
          case 137: break;
          case 36: 
            { 
            } 
            // fall through
          case 138: break;
          case 37: 
            { yybegin(INITIAL); tokenEnd(); return STRING;
            } 
            // fall through
          case 139: break;
          case 38: 
            { return TYPE_ARGUMENT;
            } 
            // fall through
          case 140: break;
          case 39: 
            { return FLOAT;
            } 
            // fall through
          case 141: break;
          case 40: 
            { return OF;
            } 
            // fall through
          case 142: break;
          case 41: 
            { return PLUSDOT;
            } 
            // fall through
          case 143: break;
          case 42: 
            { return TO;
            } 
            // fall through
          case 144: break;
          case 43: 
            { return AS;
            } 
            // fall through
          case 145: break;
          case 44: 
            { return DO;
            } 
            // fall through
          case 146: break;
          case 45: 
            { return IF;
            } 
            // fall through
          case 147: break;
          case 46: 
            { return IN;
            } 
            // fall through
          case 148: break;
          case 47: 
            { return POLY_VARIANT;
            } 
            // fall through
          case 149: break;
          case 48: 
            { return SLASHDOT;
            } 
            // fall through
          case 150: break;
          case 49: 
            { yybegin(IN_RML_COMMENT); commentDepth = 1; tokenStart();
            } 
            // fall through
          case 151: break;
          case 50: 
            { return AUTO_CLOSE_TAG;
            } 
            // fall through
          case 152: break;
          case 51: 
            { return STARDOT;
            } 
            // fall through
          case 153: break;
          case 52: 
            { yybegin(IN_OCL_COMMENT); commentDepth = 1; tokenStart();
            } 
            // fall through
          case 154: break;
          case 53: 
            { return UNIT;
            } 
            // fall through
          case 155: break;
          case 54: 
            { return ANDAND;
            } 
            // fall through
          case 156: break;
          case 55: 
            { return SHORTCUT;
            } 
            // fall through
          case 157: break;
          case 56: 
            { return EQEQ;
            } 
            // fall through
          case 158: break;
          case 57: 
            { return ARROW;
            } 
            // fall through
          case 159: break;
          case 58: 
            { return MINUSDOT;
            } 
            // fall through
          case 160: break;
          case 59: 
            { return SIMPLE_ARROW;
            } 
            // fall through
          case 161: break;
          case 60: 
            { return PIPE_FORWARD;
            } 
            // fall through
          case 162: break;
          case 61: 
            { return RARRAY;
            } 
            // fall through
          case 163: break;
          case 62: 
            { return CLOSE_TAG;
            } 
            // fall through
          case 164: break;
          case 63: 
            { return DIFF;
            } 
            // fall through
          case 165: break;
          case 64: 
            { return LARRAY;
            } 
            // fall through
          case 166: break;
          case 65: 
            { return NOT_EQ;
            } 
            // fall through
          case 167: break;
          case 66: 
            { commentDepth += 1;
            } 
            // fall through
          case 168: break;
          case 67: 
            { commentDepth -= 1; if(commentDepth == 0) { yybegin(INITIAL); tokenEnd(); return COMMENT; }
            } 
            // fall through
          case 169: break;
          case 68: 
            { return FOR;
            } 
            // fall through
          case 170: break;
          case 69: 
            { return FUN;
            } 
            // fall through
          case 171: break;
          case 70: 
            { return END;
            } 
            // fall through
          case 172: break;
          case 71: 
            { return TRY;
            } 
            // fall through
          case 173: break;
          case 72: 
            { return LET;
            } 
            // fall through
          case 174: break;
          case 73: 
            { return REF;
            } 
            // fall through
          case 175: break;
          case 74: 
            { return REC;
            } 
            // fall through
          case 176: break;
          case 75: 
            { return SIG;
            } 
            // fall through
          case 177: break;
          case 76: 
            { return VAL;
            } 
            // fall through
          case 178: break;
          case 77: 
            { return EQEQEQ;
            } 
            // fall through
          case 179: break;
          case 78: 
            { return NOT_EQEQ;
            } 
            // fall through
          case 180: break;
          case 79: 
            { return OPEN;
            } 
            // fall through
          case 181: break;
          case 80: 
            { return ELSE;
            } 
            // fall through
          case 182: break;
          case 81: 
            { return TYPE;
            } 
            // fall through
          case 183: break;
          case 82: 
            { return TRUE;
            } 
            // fall through
          case 184: break;
          case 83: 
            { return THEN;
            } 
            // fall through
          case 185: break;
          case 84: 
            { return LAZY;
            } 
            // fall through
          case 186: break;
          case 85: 
            { return LIST;
            } 
            // fall through
          case 187: break;
          case 86: 
            { return DONE;
            } 
            // fall through
          case 188: break;
          case 87: 
            { return WITH;
            } 
            // fall through
          case 189: break;
          case 88: 
            { return NONE;
            } 
            // fall through
          case 190: break;
          case 89: 
            { return SOME;
            } 
            // fall through
          case 191: break;
          case 90: 
            { return FALSE;
            } 
            // fall through
          case 192: break;
          case 91: 
            { return MATCH;
            } 
            // fall through
          case 193: break;
          case 92: 
            { return RAISE;
            } 
            // fall through
          case 194: break;
          case 93: 
            { return OBJECT;
            } 
            // fall through
          case 195: break;
          case 94: 
            { return OPTION;
            } 
            // fall through
          case 196: break;
          case 95: 
            { return MODULE;
            } 
            // fall through
          case 197: break;
          case 96: 
            { return ASSERT;
            } 
            // fall through
          case 198: break;
          case 97: 
            { return STRUCT;
            } 
            // fall through
          case 199: break;
          case 98: 
            { return SWITCH;
            } 
            // fall through
          case 200: break;
          case 99: 
            { return MUTABLE;
            } 
            // fall through
          case 201: break;
          case 100: 
            { return INCLUDE;
            } 
            // fall through
          case 202: break;
          case 101: 
            { return FUNCTION;
            } 
            // fall through
          case 203: break;
          case 102: 
            { return EXTERNAL;
            } 
            // fall through
          case 204: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

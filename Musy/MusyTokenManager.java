package Musy;
/* MusyTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. MusyTokenManager.java */
import jm.JMC;
import jm.music.data.*;
import jm.util.*;

/** Token Manager. */
@SuppressWarnings("unused")public class MusyTokenManager implements MusyConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3803060L) != 0L)
         {
            jjmatchedKind = 27;
            return 4;
         }
         if ((active0 & 0x380L) != 0L)
         {
            jjmatchedKind = 21;
            return 0;
         }
         if ((active0 & 0x400c00L) != 0L)
         {
            jjmatchedKind = 27;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x2000L) != 0L)
            return 4;
         if ((active0 & 0x3c01c60L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 1;
            return 4;
         }
         if ((active0 & 0x380L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 21;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x3c01c60L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
            return 4;
         }
         if ((active0 & 0x380L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 21;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0x1060L) != 0L)
            return 4;
         if ((active0 & 0x1c00000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x2000c00L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 3;
            return 4;
         }
         return -1;
      case 4:
         if ((active0 & 0x2000000L) != 0L)
            return 4;
         if ((active0 & 0x1c00000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0xc00L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x1c00000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0xc00L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 5;
            return 4;
         }
         return -1;
      case 6:
         if ((active0 & 0xc00L) != 0L)
            return 4;
         if ((active0 & 0x1c00000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x1c00000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x1000000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 27;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 15);
      case 41:
         return jjStopAtPos(0, 16);
      case 44:
         return jjStopAtPos(0, 14);
      case 49:
         return jjMoveStringLiteralDfa1_0(0x380L);
      case 58:
         return jjStopAtPos(0, 20);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x1800040L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1020L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2002000L);
      case 123:
         return jjStopAtPos(0, 17);
      case 124:
         return jjStopAtPos(0, 19);
      case 125:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa2_0(active0, 0x380L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x3800000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 79:
      case 111:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 4);
         return jjMoveStringLiteralDfa2_0(active0, 0x440L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 49:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(2, 9);
         break;
      case 50:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(2, 8);
         break;
      case 52:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(2, 7);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000400L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x1c00000L);
      case 69:
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 4);
         break;
      case 80:
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000c00L);
      case 84:
      case 116:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 4);
         break;
      case 89:
      case 121:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 79:
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 4);
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0xc00000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 4);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 89:
      case 121:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(6, 11, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      case 69:
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(7, 22);
         break;
      case 71:
      case 103:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(7, 23);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(9, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 5;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  { jjCheckNAdd(0); }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(4); }
                  }
                  if ((0x1ff000000000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                  }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(4); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 27)
                        kind = 27;
                     { jjCheckNAdd(4); }
                  }
                  if ((0xfe000000feL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(4); }
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  { jjCheckNAdd(4); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\61\57\64", "\61\57\62", "\61\57\61", 
null, null, null, null, "\54", "\50", "\51", "\173", "\175", "\174", "\72", null, 
null, null, null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("PART -> " + image);
         break;
      case 6 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("NOTE -> " + image);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                             System.out.println("QUARTER -> " + image);
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                             System.out.println("HALF -> " + image);
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                             System.out.println("WHOLE -> " + image);
         break;
      case 10 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("COMP -> " + image);
         break;
      case 11 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("DISP -> " + image);
         break;
      case 12 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("PLAY -> " + image);
         break;
      case 13 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                             System.out.println("TO -> " + image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                             System.out.println("COMMA -> " + image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                             System.out.println("LPAR -> " + image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                             System.out.println("RPAR -> " + image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                             System.out.println("LBRAC -> " + image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                             System.out.println("RBRAC -> " + image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                               System.out.println("PIPE -> " + image);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                               System.out.println("COLON -> " + image);
         break;
      case 21 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                               System.out.println("NUMBER -> " + image);
         break;
      case 22 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                               System.out.println("ADDN -> " + image);
         break;
      case 23 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                               System.out.println("NEWS -> " + image);
         break;
      case 24 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                               System.out.println("NEWP -> " + image);
         break;
      case 25 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                               System.out.println("TEMPO -> " + image);
         break;
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                          System.out.println("TONE -> " + image);
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                   System.out.println("ID -> " + image);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public MusyTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public MusyTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 5; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[5];
    private final int[] jjstateSet = new int[2 * 5];

    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    
    protected char curChar;
}

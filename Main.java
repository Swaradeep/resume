

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String st = "^rakbgt Pbpart al Ahcmhb Hbws ^artjc ^jib - :<^rakbgt Gjtbiary Pbcjtmahjc Djtj`jsb Fjhjibfbht Wystbf (PD@FW) ; Toms ms jh PD@FW `jsbd prakbgtwomgo ms gurrbhtcy usmhi FyWZC lar jcc tob trjhsjgtmah stjtbfbhts. FyWZC ms jhapbhsaurgb PD@FW Wystbf. @rmbl Mhtradugtmah j`aut PD@WF ; J rbcjtmahjc djtj`jsb fjhjibfbht systbf (PD@FW) ms j djtj`jsb fjhjibfbhtsystbf (D@FW) tojt ms `jsbd ah tob rbcjtmahjc fadbc js mhvbhtbd `y B. L. Gadd, alM@F's Wjh Kasb Pbsbjrgo Cj`arjtary. Fjhy papucjr djtj`jsbs gurrbhtcy mh usb jrb`jsbd ah tob rbcjtmahjc djtj`jsb fadbc.PD@FWs ojvb `bgafb j prbdafmhjht goamgb lar tob starjib al mhlarfjtmah mh hbwdjtj`jsbs usbd lar lmhjhgmjc rbgards, fjhuljgturmhi jhd caimstmgjc mhlarfjtmah,pbrsahhbc djtj, jhd fugo farb smhgb tob :=?>s. Pbcjtmahjc djtj`jsbs ojvb altbhrbpcjgbd cbijgy ombrjrgomgjc djtj`jsbs jhd hbtware djtj`jsbs `bgjusb toby jrb bjsmbrta uhdbrstjhd jhd usb. Oawbvbr, rbcjtmahjc djtj`jsbs ojvb `bbh gojccbhibd `y a`kbgtdjtj`jsbs, womgo wbrb mhtradugbd mh jh jttbfpt ta jddrbss tob a`kbgt-rbcjtmahjcmfpbdjhgb fmsfjtgo mh rbcjtmahjc djtj`jsb, jhd _FC djtj`jsbs";
	Scanner s = new Scanner(System.in);
	char[] a;
	//st = s.nextLine();
	a = st.toCharArray();
	for(int i=0; i<a.length; i++){
	    switch(a[i]){
		case '”':a[i] = '\'';
		    break;
		case '2':a[i] = '5';
		    break;
		case '7':a[i] = '3';
		    break;
		case '9':a[i] = '7';
		    break;
		case '<':a[i] = '6';
		    break;
		case '0':a[i] = '2';
		    break;
		case ':':a[i] = '1';
		    break;
	        case 'a':a[i] = 'o';
	            break;
		case '>':a[i] = '0';
	            break;
	        case 'b':a[i] = 'e';
		    break;
		case '?':a[i] = '8';
	            break;
		case '=':a[i] = '9';
	            break;
	        case 'c':a[i] = 'l';
		    break;
		case 'e':a[i] = 'k';
	            break;
	        case 'f':a[i] = 'm';
	            break;
	        case 'g':a[i] = 'c';
	            break;
	        case 'h':a[i] = 'n';
	            break;
	        case 'i':a[i] = 'g';
	            break;
	        case 'j':a[i] = 'a';
		    break;
		case 'k':a[i] = 'j';
	            break;
	        case 'l':a[i] = 'f';
	            break;
	        case 'm':a[i] = 'i';
	            break;
	        case 'o':a[i] = 'h';
	            break;
	        case 'q':
	            break;
	        case 'x':
	            break;
	        case 'y':
	            break;
	        case 'z':
	            break;
	        case 'A':a[i] = 'O';
	            break;
	        case 'B':a[i] = 'E';
	            break;
	        case 'C':a[i] = 'L';
	            break;
	        case 'D':
	            break;
	        case 'E':
	            break;
	        case 'F':a[i] = 'M';
	            break;
	        case 'G':a[i] = 'C';
	            break;
	        case 'H':a[i] = 'N';
	            break;
	        case 'I':
	            break;
	        case 'J':a[i] = 'A';
	            break;
	        case 'K':
	            break;
	        case 'L':a[i] = 'F';
	            break;
	        case 'M':a[i] = 'I';
	            break;
	        case 'N':
	            break;
	        case 'O':a[i] = 'H';
	            break;
	        case 'P':a[i] = 'R';
	            break;
	        case 'Q':
	            break;
	        case 'R':a[i]= 'U';
	            break;
	        case 'S':
	            break;
	        case 'U':
	            break;
	        case 'V':
	            break;
	        case 'W':a[i] = 'S';
	            break;
	        case 'X':
	            break;
	        case 'Y':a[i] = 'W';
	            break;
	        case 'Z':a[i] = 'Q';
	            break;
		    case '^': a[i] = 'P';
		        break;
	     	case '`':a[i] = 'b';
		        break;
		case '@':a[i] = 'B';
		        break;
		case ']':a[i] = 'Y';
		        break;
	    }
	}
	for(int i=0; i<a.length;i++){
	    System.out.print(a[i]);
	}
	}
}

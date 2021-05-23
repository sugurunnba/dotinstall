public class MyApp {
  public static void main(String[] args){
    // char a = 'a';  // 文字
    // int x = 10;  // 整数 byte short int long
    // long y = 5555555555L;  // longを使用するときは、末尾にL(l)をつける
    // double d = 23423.323;  // 浮動小数点数
    // float f = 32.35F;  // floatを使用するときは、末尾にFをつける
    // String msg = "Hello Wo\nrld Ag\tain!";  //文字列
    // boolean flag = true; //またはfalse  // 論理値
    // \n; 改行 特殊文字
    // \t; タブ 特殊文字

    // キャスト
    // int i =  10;
    // double D = (double)i / 4;  (double)としてidouble型にキャスト(変換)してあげることで、小数点以下の数字も含めてdouble Dに代入することができる。
    // System.out.println(D);

    // 条件演算子(if文)
    // int score = 45;
    // String msg = score > 80 ? "Great" : "so so...!";
      // score > 80の時、trueなら"Great", falseなら"so so...!"
    // System.out.println(msg);
    
    // switch
    // String signal = "green";
    // switch(signal){
    //   case "red":
    //     System.out.println("stop!");
    //     break;
    //   case "blue":
    //   case "green":  //実行させたい処理が複数ある時は、caseの条件を続けて記入してあげる。
    //     System.out.println("go!");
    //     break;
    //   case "yellow":
    //     System.out.println("caution!");
    //     break;
    //   default:
    //     System.out.println("wrong signal!");
    //     break;
    // }
    
    // while
    // int i = 0;
    // while(i < 10){
    //   System.out.println(i);
    //   i++;
    // }
  //   do {  //do-whileは、先に処理を実行してからループを始める
  //     例えば、iが100の場合はwhile文だと条件を満たさないのでprintlnされないが、do-whileだと一度処理を実行してからループを始めるので、printlnが実行される
  //     System.out.println(i);
  //     i++;
  //   } while(i < 10);
  // }
}
// System.out.println();
// コンパイル
// javac MyApp.java
// 実行
// java MyApp
// public class MyApp {
//   public static void main(String[] args){
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

    // for
    // for(int i = 0; i < 10; i++){
    //   if( i == 5){
    //     // break; そこで表示を止める
    //     continue; //該当の結果のみスキップする
    //   }
    //   System.out.println(i);
    // }

    // 配列
    // int[] sales = new int[3];
    // // → int[] sales = new int[] {100, 200, 300}; 同じ意味
    // // → int[] sales = {100, 200, 300}; 同じ意味
    // sales[0] = 100;
    // sales[1] = 200;
    // sales[2] = 300;
    // System.out.println(sales[1]);
    // sales[1] = 1000;
    // System.out.println(sales[1]);

    // 配列2
    // int[] sales = {700, 400, 200};
    // // for(int i = 0; i < 3; i++){
    // // →for(int i = 0; i < sales.length; i++){
    // //   System.out.println(sales[i]);
    // // }
    // for(int sale : sales){
    //   System.out.println(sale);
    // }

    // 基本データ型と参照型
    // ①
    // int x = 10;
    // int y = x;
    // y = 5;
    // System.out.println(x); //10が表示される
    // System.out.println(y); //5が表示される
    // ②
    // int[] a = {3, 5, 7}; //intの配列は参照型なので、{3,5,7}を保存しているデータの番地情報がaに入る
    // int[] b = a; //同じく参照型なので、データの番地情報をaと同じ番地情報を保存している
    // b[1] = 8; //番地先の情報を書き換えるので、a,bが呼び出す元データが変更されて、下記の通りになる。
    // System.out.println(a[1]); //8が表示される(元データを8に修正しているので5は表示されない)
    // System.out.println(b[1]); //8が表示される
    // ③
    // String s = "hello"; //Stringは参照型なので、"hello"を保存しているデータの番地情報がsに入る
    // String t = s;
    // t = "world"; //Stringの元データを修正することはできず、新しい番地情報にデータ(world)が入る仕組み
    // //なので、②のように元データが修正されることはないので、"hello world"と表示される
    // System.out.println(s); //hello
    // System.out.println(t); //world
//     }
//   }

//method (複数の処理を名前をつけて管理する方法)
//   public static String sayHi(String name){
//     // →voidは返り値がない時に使用する
//     return "Hi!" + name;
//   }
//   // オーバーロード
//   public static void sayHi(){
//     System.out.println("Hi! Nobody!");
//   }
//   public static void main(String[] args){
//     // sayHi();
//     String msg = sayHi("runba!");//←引数
//     System.out.println(msg);
//     sayHi();
//  }
// }

// class User {
//   String name;//クラスに属する変数は「フィールド」と呼ばれる
//   // コンストラクタ(クラスがインスタンス化される時に必ず呼び出されるメソッド)
//   User(String name){ //コンストラクタ名はクラス名と同じ
//     this.name = name;
//   }
//   // コンストラクタのオーバーロード(引数なし)
//   User() {
//     this.name = "Me!";
//     // this()について →クラス内にある別コンストラクタへデータを渡してあげる
//     // → this("Mi!!"); とすれば、該当する引数のコンストラクタ(128行目)に"Mi"を渡す。結果的にthis.name(129行目)に"Mi!"が渡されるので、148行目のように記述しても"Mi"というデータが入った状態で表示されることになる
//   }
//   void sayHi(){
//     System.out.println("hi!" + this.name);
//   }
// }
// public class MyApp {
//   public static void main(String[] args){
//     User tom; //クラスは参照型なので、この時点ではメモリ領域にデータが生み出されていない
//     User runba;
//     // tom = new User("tom"); //newとしてUserクラスからインスタンスを作成することで、メモリ領域にデータが保存される
//     // ※tomにはUserインスタンスの番地情報が入っている(参照型)
//     tom = new User("tom");
//     runba = new User();
//     System.out.println(tom.name); //←引数ありのコンストラクタを使用
//     System.out.println(runba.name); //←引数なしのコンストラクタを使用
//     tom.sayHi();
//     runba.sayHi();
//   }
// }

// クラスの継承について(lesson20~)
class User{ //親クラスorスーパークラス
  String name;
  User(String name){
    this.name = name;
  }
  User(){
    this.name = "Mi!";
  }
  void sayHi(){
    System.out.println("hi! " + this.name);
  }
}
// 継承することで、親クラスのフィールドやメソッドを使用できる
class AdminUser extends User {  //子クラスorサブクラス
  AdminUser(String name){  //子クラスがコンストラクタを作成すると、自動的に親クラスのコンストラクタを呼び出すようになっている
    super(name);  //親クラスのコンストラクタに記載している内容をsuper(引数があれば入れる)で持ってくることができる
  }
  // メソッドのオーバーライド (親クラスのメソッドを子クラスにて上書き)
  @Override //アノテーション(オーバーライド状態を明示的にしている。またオーバーライドする際にメソッド名を間違えて記入してしまった場合には、エラーを出してくれる)
  void sayHi(){
    System.out.println("[admin] hi! " + this.name);
  }
  void sayHello() {
    System.out.println("hello! " + this.name);
  }
}

public class MyApp {
  public static void main(String[] args){
    User tom = new User("tom");;
    System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}

// System.out.println();
// コンパイル
// javac MyApp.java
// 実行
// java MyApp
// 拡大
// シフト＋コマンド＋=
// 縮小
// コマンド＋=
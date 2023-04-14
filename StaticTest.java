/**
 * 多様な商品を売っている自動販売機
 */

 class VendingMachine {

    String seriesName;  //このシリーズの名前
    String boxName;     //店頭での自販機名
    int breadNum;       //パンの在庫限
    int cokeNum;        //コーラの在庫
    int snackNum;       //スナック菓子の在庫

    /**
     * コンストラクタ、オレンジジュース、コーラ、ミネラルウォーターの初期値を決めて初期化
     */
    public VendingMachine(String boxName){
        this.breadNum      = 10;
        this.cokeNum       = 10;
        this.snackNum      = 10;
        this.seriesName    = "マルチフードボックス";
        this.boxName       = boxName;
    }

    /**
     * このシリーズの自販機の名前を返す
     */
    public String getSeriesName(){
        return this.seriesName;
    }

    /**
     * このBOXの自販機名を返す
     */
    public String getBoxName(){
        return this.boxName;
    }

    /**
     * 代金を受け取って、商品を販売する（出す）
     * @param item 商品名
     * @return 出てくる商品名
     */
    public String sell(String item){
        if (item == "bread"){
            this.breadNum -= 1;
            return "bread";
        } else if (item == "coke"){
            this.cokeNum -= 1;
            return "coke";
        } else if (item == "snacks"){
            this.snackNum -= 1;
            return "snacks";
        } else {
            return "no item";
        }
    }

    /**
     * 現在の在庫数を伝える
     * @return 各商品の在庫数を伝えるメッセージ
     */
    public String getAllNum(){
        return this.boxName + "では、パンの在庫は" + this.breadNum +
        "。　コーラの在庫は" + this.cokeNum +
        "。　スナック菓子の在庫は" + this.snackNum + "です。";
    }
 }

 public class StaticTest {
    public static void main(String[] args){
        String separator = System.getProperty("line.separator");
        VendingMachine vm1 = new VendingMachine("京都駅前BOX");

        System.out.printf("この自販機のシリーズ名は%s、ボックス名は%sです。%s",
        vm1.getSeriesName(),
        vm1.getBoxName(),
        separator);

        String boughtItem1 = vm1.sell("coke");
        String boughtItem2 = vm1.sell("snacks");
        String boughtItem3 = vm1.sell("coke");
        String boughtItem4 = vm1.sell("aaaaa");

        System.out.printf("買った商品は%sです。%s", boughtItem1, separator);
        System.out.printf("買った商品は%sです。%s", boughtItem2, separator);
        System.out.printf("買った商品は%sです。%s", boughtItem3, separator);
        System.out.printf("買った商品は%sです。%s", boughtItem4, separator);
        System.out.println(vm1.getAllNum());
    }
 }
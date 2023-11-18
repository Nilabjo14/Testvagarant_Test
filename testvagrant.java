class Shopping {
    String name;
    int price;
    double gst;
    int quantity;

    Shopping(String name, int price, double gst, int quantity) {
        this.name = name;
        this.price = price;
        this.gst = gst;
        this.quantity = quantity;
    }
}

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Shopping[] res = new Shopping[4];
        res[0] = new Shopping("Leather Wallet", 100, 0.18, 1);
        res[1] = new Shopping("Umbrella", 900, 0.12, 4);
        res[2] = new Shopping("Cigarette", 200, 0.28, 3);
        res[3] = new Shopping("Honey", 100, 0, 2);
        m.check(res);
    }

    public void check(Shopping[] res) {
        int max = Integer.MIN_VALUE;
        double total = 0.0;String mn="";

        for (int i = 0; i < res.length; i++) {
            if(max<(res[i].price * res[i].quantity * res[i].gst * 100))
            {
                max=(int)(res[i].price * res[i].quantity * res[i].gst * 100);
                mn=res[i].name;
            }
            double e = res[i].price * res[i].quantity;
            double a = 0.0;

            if (res[i].price >= 500) {
                a = (e + e * res[i].gst) - e * 0.05;
            } else {
                a = (e + e * res[i].gst);
            }
            total = total + a;
        }

        System.out.println("Maximum gst=" + mn); 
        System.out.println("Total money=" + total);
    }
}

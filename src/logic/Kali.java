package logic;

public class Kali {
    double multiple;

    public Kali (double x, double y){
        this.multiple = proses(x,y);
    }
    public Kali (String x){
        var arr = x.split(" ");
        this.multiple = (Double.parseDouble(arr[0])*Double.parseDouble((arr[1])));
    }
    double proses(int x, int y){
        return (double) x*y;
    }
    double proses(double y, double x){
        return x*y;
    }

    double proses(String x){
        var arr = x.split(" ");
        return Double.parseDouble(arr[0])* Double.parseDouble(arr[1]);
    }
}


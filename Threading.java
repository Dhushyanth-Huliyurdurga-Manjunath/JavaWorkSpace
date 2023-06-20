class ThreadingDemo extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running.");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Threading{
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i < n; i++){
            ThreadingDemo object = new ThreadingDemo();
            object.start();
            if(object.isAlive()){
                System.out.println(object.getName());
            }
        }
    }
}
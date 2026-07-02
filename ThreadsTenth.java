class Natural extends Thread{
	@Override
	public void run(){
		System.out.println("Thread 1 : Printing Natural numbers : ");
		for(int i=1; i<=100; i++){
			System.out.print(i+" ");
			
		}
		System.out.println("\nThead 1 finished\n");
	}
}
class Even extends Thread{
	@Override
	public void run(){
		System.out.println("Thread 2 : Printing Even numbers : ");
		for(int i=1; i<=100; i++){
			if(i%2==0) System.out.print(i+" ");
			
		}
	
		System.out.println("\nThead 2 finished\n");
	}
}

class Odd extends Thread{
	@Override
	public void run(){
		System.out.println("Thread 2 : Printing odd numbers : ");
		for(int i=1; i<=100; i++){
			if(i%2==1) System.out.print(i+" ");
			
		}
		System.out.println("\nThead 3 finished\n");
	}
}
class ThreadsTenth{
	public static void main(String args[]){
		Natural t1 = new Natural();
		Even t2 = new Even();
		Odd t3 = new Odd();
		try{
			t2.start();
			t2.join();
			System.out.println();
			t1.start();
			t1.join();
			System.out.println();	
			t3.start();
			t3.join();
		}
		catch(Exception e){
			System.out.println("Thread error occured");
		}
		
	}
}
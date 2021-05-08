package array;

public class SimpleArrayList {

   //어레이에서 어레이리스트로 바꿔볼거얌
   int capacity = 3;   //나중에 늘려갈거임. 나중에 안바뀌게 하려고 final 쓴대
   String[] dataArray = new String[capacity];      //표현할 자료구조 만들어야함
   int size = 0;   //데이터 개수 = 사이즈 개수

   String get(int index) {
      //인덱스 값 받아서 저장된 데이터 보내줘야함
      if(index<0 || index>size-1) {
    	  return null;
      }
      return dataArray[index];
   }
   
   void add(int index, String data) {
      //어느 위치에 넣어라
	  if(index<0 || index>size) {
		  return; // validation check
	  }
	  if(size == capacity) {
		  enlargeCapacity(); // return;
	  }
	  for (int i = size-1; i>=index; i--) {
		  dataArray[i+1] = dataArray[i];   //공간확보
	  }
	  dataArray[index] = data;
	  size++;
   }
   
   private void enlargeCapacity() {
	   // TODO Auto-generated method stub
	   String [] bigArray = new String [capacity * 2];
	   System.arraycopy(dataArray, 0, bigArray, 0, size);
	   dataArray = bigArray;
	   capacity = capacity * 2;
   }
   
   String remove(int index) {
      if(index<0 || index>size) {
         return null;
      }
      String val = dataArray[index];
      for(int i = index+1; i<size; i++) {
         dataArray[i-1] = dataArray[i];
      }
      return val;
      
   }
   boolean remove(String data) {
      int temp = indexOf(data);
      return (remove(temp) != null);
   }
   
   int indexOf(String data) {
      for(int i=0; i<size; i++) {
         if(data==dataArray[i]) {
        	 return i;
         }
      }
      return -1;
   }
   
   public int sizeOf() {
      return size;
   }
   
   public String toString() {
      String result = "";
      for(int i = 0; i<size; i++) {
    	  result = result + dataArray[i].toString() + " ";
      }
      return result;
   }
   
}
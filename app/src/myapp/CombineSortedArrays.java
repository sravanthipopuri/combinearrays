package myapp;

import java.util.Arrays;

public class CombineSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		try{
			//	System.out.println("args:"+Arrays.toString(args));
				if(args != null && args.length > 0){
					String strArr1 = args[0];
					String strArr2 = args[1];
			        
					int[] s1 = convertToIntArray(strArr1);
			//		System.out.println("s1:"+Arrays.toString(s1));
					int[] s2 = convertToIntArray(strArr2);
			//		System.out.println("s2:"+Arrays.toString(s2));
					int[] combined = null;
					
					if(s1 != null && s1.length > 0 && s2 != null && s2.length > 0){
						combined = combineArrays(s1, s2);
					}else if(s1 == null || (s1 != null && s1.length == 0)){
						combined = s2;
					}else if(s2 == null || (s2 != null && s2.length == 0)){
						combined = s1;
					}
					System.out.println(Arrays.toString(combined));
				}
			}catch(Exception e){
				System.out.println("Exceptio in main: "+e.getMessage());
			}

	}
	
	private static int[] convertToIntArray(String str) {
		int[] array = null;		
		if(str != null && str.length() > 0) {			
			String[] s = str.replaceAll("\\[", "").replaceAll("]", "").split(",");
			array = new int[s.length];	        
	        for (int i = 0; i < s.length; i++) {	            
	            try {	            	
	                array[i] = Integer.parseInt(s[i].trim());	                
	            } catch (Exception e) {	            	
	                System.out.println("Exception while parsing string to int: " + e.getMessage());	                
	            }	            
	        }
		}
        return array;
	}

	private static int[] combineArrays(int[] s1, int[] s2){
		
		int l1 = s1.length;
		int l2 = s2.length;
		int l3 = l1 + l2;
		
		int[] s3 = new int[l3];
		
		int pos = 0;
		int pos2 = 0;
		int pos3 = 0;
		
		while(pos < l1 && pos2 < l2){
			if(s1[pos] < s2[pos2]){
				s3[pos3] = s1[pos];
				pos++;
			}else{
				s3[pos3] = s2[pos2];
				pos2++;
			}
			pos3++;
		}
		
		while(pos < l1){
			s3[pos3] = s1[pos];
			pos++;
			pos3++;
		}
		
		while(pos2 < l2){
			s3[pos3] = s2[pos2];
			pos2++;
			pos3++;
		}
		
		return s3;
	}

}

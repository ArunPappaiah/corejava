package com.chainsys.variables;
/**
 * 
 * @author arun3117
 *Created on: 25 March 2022
 *
 */
public class Calculator {
/**
 * Add method: will take 2 integer values using the following parameters
 * and will add the values.The result of totaling will be returned back to yhe caller
 * This a static method, object reference is not required. 
 * @param param1 of type int
 * @param param2 of type int
 * @return type int
 */
	public static int add(int param1, int param2) {
		int result = param1+param2;
		return result;
	}
	
	/**
	 * Multiply method: will take 2 integer values using the following parameters
	 * and will Multiply the values.The result of totaling will be returned back to yhe caller
	 * This a static method, object reference is not required. 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
		public static int Multiply(int param1, int param2) {
			int result = param1*param2;
			return result;
		}
		
		/**
		 * divide method: will take 2 integer values using the following parameters
		 * and will divide the values.The result of totaling will be returned back to yhe caller
		 * This a static method, object reference is not required. 
		 * @param param1 of type int
		 * @param param2 of type int
		 * @return type int
		 */
			public static int devide(int param1, int param2) {
				int result = param1/param2;
				return result;
			}
			
			/**
			 * sub method: will take 2 integer values using the following parameters
			 * and will sub the values.The result of totaling will be returned back to yhe caller
			 * This a static method, object reference is not required. 
			 * @param param1 of type int
			 * @param param2 of type int
			 * @return type int
			 */
				public static int sun(int param1, int param2) {
					int result = param1-param2;
					return result;
				}
}


//Addition function
static int add(int a, int b){
	return a+b;
}

//Subtraction Function
static int subtract(int a,int b){
	return a -b;
}

//division function
static int division(int a, int b){
	return a/b;
}

//multiplication function
static int multiply(int a, int b){
	return a*b;
}

//power function
static int power(int a, int b){
	int ans =1;
	for(int i=1;i<=b;i++)
		ans*=a;
	return ans;
}
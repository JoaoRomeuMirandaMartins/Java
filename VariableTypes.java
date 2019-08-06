public class VariableTypes{
 public static void main(String[] args){
  int Cont;
  Cont = 0;
  int Divisor;
  boolean Flag;
  while(Cont<100) {
   Flag = true;
   Divisor = 2;
   while(Divisor<=(Cont/2)) {
	if((Cont%Divisor) == 0){
     Flag = false;
	};
	Divisor = Divisor + 1;
   };
   if (Flag) {
	System.out.println(Cont + " é primo.");
   };
   Cont = Cont + 1;
  };
 };
};
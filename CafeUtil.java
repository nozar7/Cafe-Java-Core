import java.util.Date;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;
public class CafeUtil {
    
    public String saludoBasico() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String saludoPersonalizado(String name) {
        // TU CÓDIGO AQUI
	String saludo = String.format("Hola, %s Encantado de verte",name);  
        return saludo;
    }
    
    public String mencionarEdad(int age){
    	// MAS CODIGO AQUI 
    	String respuesta = "Tu edad es de " + age + " años de Edad";
    	return respuesta;
    }
    
    // EMPEZAMOS CON LOS METODOS CORE
    public int getStreakGoal(){ 
    int suma=0;
    for(int i=0;i<=10;i++){
    	suma+=i;
    	//System.out.println(i);
    }
    return suma;
    }
    
    public int getStreakGoalForNumberWeeks(int numWeeks){ 
    int suma=0;
    for(int i=0;i<=numWeeks;i++){
    	suma+=i;
    	//System.out.println(i);
    }
    return suma;
    }
    
    public double getOrderTotal(double[] prices){
    int suma = 0;
    for(int i=0; i<prices.length;i++){
    	suma += prices[i];
    }
    return suma;
    }
    
    public void displayMenu(ArrayList<String> menuItems){
    for(int i=1; i<menuItems.size();i++){
    	System.out.println(i + " "+ menuItems.get(i));
    }
    }


    public void addCustomer(ArrayList<String> customers) {
    	System.out.println("Por favor, Ingresa tu nombre:");
    	String userName = System.console().readLine();
    	System.out.println("Hola, "+userName+"!!");
    	System.out.println("Hay "+customers.size()+" personas frente a ti");
    	customers.add(userName);
    }
    
    public void printPriceChart(String product, double price, int maxQuantity) {
    	System.out.println(product.toUpperCase());
    	double result = 1.00;
    	for(int i=1;i<=maxQuantity;i++) {
    		result = price*i;
    		System.out.println(i+". "+formatearMoneda(result));
    	}
    	System.out.println("\n");
    }
    
    public String formatearMoneda(double numero){
    NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.US);
    return formato.format(numero);
    }
}

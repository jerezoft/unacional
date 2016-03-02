package dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Resultado;


public class controller {

private static Resultado res;
public static String vista;
	
	public static Resultado BuscarManeraUno(int a){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Final");
		EntityManager em = emf.createEntityManager();
			try {
			res = new Resultado();
			res = em.find(Resultado.class,a);
		   if(res == null){
				
				vista = "error";
			}else{
				vista = "SUCCESS";
			}
		} catch (Exception e) {
			System.out.println("Error al conectar "+e.getMessage());
		}finally{
			em.close();
			emf.close();
		}
		
		return res;
		
	}	
	
}

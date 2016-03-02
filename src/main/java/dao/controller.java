package dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Resultado;


public class controller {

private static Resultado res;
public static String vista;
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Final");
static EntityManager em = emf.createEntityManager();
	public static Resultado BuscarManeraUno(int a){
	
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

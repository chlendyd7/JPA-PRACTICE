package jpabook.start;

import java.util.List;

import javax.persistence.*;

public class JpaMain2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("jpabook");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			logic(em);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}

	private static void logic(EntityManager em) {

		String id = "id1";
		Member member = new Member();
		member.setId(id);
		member.setUsername("지안");
		member.setAge(2);

		em.persist(member);
		
		member.setAge(20);

		Member findMember = em.find(Member.class, id);
		System.out.println("findMember=" + findMember.getUsername()
			+ ", age=" + findMember.getAge());
		
		List<Member> members =
				em.createQuery("select m from Member m", Member.class).getResultList();
		System.out.println("member.size=" + members.size());
		
		em.remove();
	}
}

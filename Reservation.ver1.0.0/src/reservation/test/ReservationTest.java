package reservation.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import reservation.dao.AdminDaoIf;
import reservation.dao.AdminDaoImpl;
import reservation.dao.CodeDaoIf;
import reservation.dao.CodeDaoImpl;
import reservation.dao.CustomerDaoIf;
import reservation.dao.CustomerDaoImpl;
import reservation.dao.FacilityDaoIf;
import reservation.dao.FacilityDaoImpl;
import reservation.exception.DuplicateException;
import reservation.exception.NotFoundException;
import reservation.vo.Admin;
import reservation.vo.Code;
import reservation.vo.Customer;
import reservation.vo.Facility;

/**
 *  Admin 테스트 클래스
 * @author 오진오
 *
 */
public class ReservationTest {

	public static void main(String[] args) throws DuplicateException, NotFoundException {
//		// 1. dao 객체를 얻어냄
//		AdminDaoIf aDdao = new AdminDaoImpl();
//		CustomerDaoIf cUdao = new CustomerDaoImpl();
		FacilityDaoIf Fdao = new FacilityDaoImpl();
//		
//		Map<String, Object> adminMap = new HashMap<>();
//		
//		Admin admin = new Admin();
//		
//		admin.setAdminId("jinoh");
//		admin.setName("진오");
//		admin.setPassword("12345a");
//		admin.setAdminType(1001);
//		admin.setEmail("zyugum@naver.com");
//		admin.setPhone("010-1111-2222");
//		admin.setRegId(0);
//		
//		
//		adminMap.put("adminId", admin.getAdminId());
//		adminMap.put("name", admin.getName());
//		adminMap.put("password", admin.getPassword());
//		adminMap.put("adminType", admin.getAdminType());
//		adminMap.put("email", admin.getEmail());
//		adminMap.put("phone", admin.getPhone());
//		adminMap.put("regId", admin.getRegId());
//		
//		
//		// update
//		int add = -2;
//		int del = -2;
////		add = aDdao.insert(adminMap);
////		System.out.printf("%d 건이 추가되었습니다", add);
////		
//
//		// 관리자 1번 삭제 
//		admin.setAdminSeq(1);
//		
//		del = aDdao.delete(admin);
//		System.out.printf("%d 건이 삭제되었습니다", del);
//		
//		List<Customer> cuss = cUdao.select(null);
//		
//		Customer cust = new Customer();
//		cust.setCustId("tester");
//		cust.setName("테스터");
//		cust.setPassword("tester");
//		cust.setCustType(5002);
//		cust.setCustNb(2015003001);
//		cust.setEmail("test@email");
//		cust.setPhone("020-2220-3551");
//		cust.setRegId("0");
//		
//		Map<String, Object> custMap = new HashMap<>();
//		custMap.put("custId", cust.getCustId());
//		custMap.put("name", cust.getName());
//		custMap.put("password", cust.getPassword());
//		custMap.put("custType", cust.getCustType());
//		custMap.put("custNb", cust.getCustNb());
//		custMap.put("email", cust.getEmail());
//		custMap.put("phone", cust.getPhone());
//		custMap.put("regId", cust.getRegId());
//		
//		System.out.println(" == 1건 추가 ==");
//		int cadd = -2;
//		cadd = cUdao.insert(custMap);
//		
//		System.out.println("== 회원 정보 출력  == ");
//		for (Customer cus:cuss) {
//			System.out.println(cus);
//		}
//		
		List<Facility> facs = Fdao.select(null);
		System.out.println("== 건물 정보 출력  == ");
		for (Facility fac:facs) {
			System.out.println(fac);
		}
		
		Facility fac = new Facility();
		fac.setBuildingCd(2001);
		fac.setFacType(3001);
		fac.setPeopleLmCd(4001);
		
		System.out.println(Fdao.serchFacility(fac));
		
//		
//
		CodeDaoIf codeDao = new CodeDaoImpl();
//		List<Code> codes = codeDao.selectReservation();
		
//		List<Code> codes = codeDao.selectPlace();
		
//		List<Code> codes = codeDao.selectLimit();
		
		List<Code> codes = codeDao.selectFacility();
			
		List<Code> codes1 = codeDao.selectLimit();
		
		List<Code> codes2 = codeDao.selectFacility();
		for (Code code: codes) {
			System.out.println(code);
		}
		
		Admin admin = new Admin();
		admin.setAdminId("jinoh");
		admin.setPassword("12345a");
		
		// ManagerDao 객체 얻기
		AdminDaoIf dao = new AdminDaoImpl();
		
		boolean a = dao.login(admin);
		System.out.println(a);
		
	}

}

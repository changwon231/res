package reservation.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import reservation.dao.AdminDaoIf;
import reservation.dao.AdminDaoImpl;
import reservation.dao.CodeDaoIf;
import reservation.dao.CodeDaoImpl;
import reservation.dao.CustomerDaoIf;
import reservation.dao.CustomerDaoImpl;
import reservation.dao.FacilityDaoIf;
import reservation.dao.FacilityDaoImpl;
import reservation.exception.DuplicateException;
import reservation.vo.Admin;
import reservation.vo.Code;
import reservation.vo.Customer;
import reservation.vo.Facility;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/res")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 서비스 메소드를 프론트 컨트롤러 메소드를 작성
	 * 모든 서비스는 action 이라는 이름의 파라미터로 수행할 작업을 추가하여 요청될 것.
	 * 
	 * 프론트 컨트롤러는 
	 * 1. 공통 작업을 수행
	 * 2. action 값에 따라 서브 컨트롤러로 분기
	 */
	protected void service(HttpServletRequest request
	           , HttpServletResponse response) throws ServletException, IOException {
			// 1. 공통작업
			// 요청으로부터 action 파라미터 추출
			String action = request.getParameter("action");
			getCodeList(request, response);
			
			System.out.println("action=" + action + ", method=" + request.getMethod());
			
			// 2. 서브 컨트롤러 분기
			if ("selectFacility".equals(action)) {
				selectFacility(request, response);
			
			} else if ("searchFacility".equals(action)) {
				searchFacility(request, response);	
			
			} else if ("join".equals(action)) {
				join(request, response);
				
//				} else if ("detail".equals(action)) {
//					detail(request, response);
//					
//				} else if ("update".equals(action)) {
//					update(request, response);
//					
//				} else if ("delete".equals(action)) {
//					delete(request, response);
//					
//				} else if ("insert".equals(action)) {
//					insert(request, response);
//					
			} else if ("login".equals(action)) {
				login(request, response);
//					
			} else if ("logout".equals(action)) {
				logout(request, response);
				
			} else if ("adminFacUpdate".equals(action)) {
				adminFacUpdate(request, response);
				
			} else {
				// localhost:8080/reser/ 로 진입할 때
				goMainPage(request, response);
			}

	}
	
	
	
	private void adminFacUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = request.getMethod();
		
		if ("GET".equals(method)) {
			// 1. 건물 조회하기
			CodeDaoIf dao = new CodeDaoImpl();
			List<Code> buildings = dao.selectFacility();
			List<Code> facilities = dao.selectPlace();
			
			// 2. 필요한 코드 있으면 조회
			
			// 3. 요청 객체에 추가
			request.setAttribute("facilities", facilities);
			request.setAttribute("buildings", buildings);
			
			// 4. 페이지 이동
			String view = "adminFacUpdate";
			request.getRequestDispatcher(view).forward(request, response);
			
		} else if ("POST".equals(method)) {
			// upload multipart resrouce
			String uploadPath = request.getRealPath("upload"); 
			
			try {
				MultipartRequest multi = new MultipartRequest( 
						request, 
						uploadPath,
						100 * 1024,
						"utf-8", 
						new DefaultFileRenamePolicy() 
						);
				
//				fileName1 = multi.getFilesystemName("file1"); 
//				orgfileName1 = multi.getOriginalFileName("file1"); 
				
				
			} catch (Exception e) {
				e.getStackTrace();
			}
			
			// 1. get request parameters
			String profile = request.getParameter("profile");
			
			// 2. make image path
			String fileImagePath = getServletContext().getContextPath() + "/upload/" + profile;
//			request.setAttribute("fileImagePath", fileImagePath);
		
			
			// 3. insert database
			// (1) get dao
			FacilityDaoIf facDao = new FacilityDaoImpl();
			
			Map<String, Object> map = new HashMap<>();
			map.put("facImg", fileImagePath);
			
			try {
				// (2) execute insert query
				facDao.insert(map);
				
				//... ?
				// 신규 입력 성공 메세지 처리
				// 이동 페이지에 필요한 데이터가 있다면 요청 객체에 추가
				// 신규 입력 후 이동할 페이지 선택
				// 페이지 이동
			} catch (DuplicateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}



	private void join(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void searchFacility(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		
		 if ("POST".equals(method)) {			
			Integer buildingCd = Integer.valueOf(request.getParameter("buildingCd"));
			Integer facType = Integer.valueOf(request.getParameter("facType"));
			Integer peopleLmCd = Integer.valueOf(request.getParameter("peopleLmCd"));
			
			Facility facility = new Facility();
			
			facility.setBuildingCd(buildingCd);
			facility.setFacType(facType);
			facility.setPeopleLmCd(peopleLmCd);
			
			// 1. dao 객체 얻기
			FacilityDaoIf facDao = new FacilityDaoImpl();
			
			// 2. dao 객체에 목록 조회 메소드 호출 하여 결과 얻기
			List<Facility> facilitys = facDao.serchFacility(facility);
			
			// 3. 얻어진 결과 request 객체에 속성으로 추가
			request.setAttribute("facilitys", facilitys);
		}
		 
		// 4. 목록을 보여줄 수 있는 뷰로 forward
		// 메인 화면인 index 로 모든 포워딩을 전달
		String view = "/index";
		
		// 메인 컨텐트 영역에 바꿔 끼울 뷰를 선택
		String content = "/searchFacility";
		// 컨엔트 영역에 끼울 뷰를 속성으로 요청 객체에 추가
		request.setAttribute("content", content);

		request.getRequestDispatcher(view).forward(request, response);
		
	}



	private void goMainPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/index";
		request.getRequestDispatcher(view).forward(request, response);
		
	}

	/**
	 * 검색에 사용되는 건물코드, 시설코드, 인원제한 코드를 검색하여 요청 객체에 추가하는 메소드
	 * @param request
	 * @param response
	 */
	private void getCodeList(HttpServletRequest request, HttpServletResponse response) {
		CodeDaoIf dao = new CodeDaoImpl();
		
		// 1. 건물코드
		List<Code> facilityCodes = dao.selectFacility();
		
		// 2. 시설 종류 코드
		List<Code> placeCodes = dao.selectPlace();
		
		// 3. 인원 제한 코드
		List<Code> limitCodes = dao.selectLimit();
		
		request.setAttribute("placeCodes", placeCodes);
		request.setAttribute("facilityCodes", facilityCodes);
		request.setAttribute("limitCodes", limitCodes);
		
	}


	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 로그아웃 처리를 위해서는
		// 1. 현재 이 요청에 연결된 세션 객체 얻기 false 로 얻어냄
		HttpSession session = request.getSession(false);
		
		// 세션에 붙어 있던 아이디 추출
		String userId = (String) session.getAttribute("userId");
		
		// 2. 얻어진 세션 객체가 null 이 아니면, userId 가 있었으면
		if (session != null && userId != null) {
			// 로그인 중으로 판단하고 해제함
			// 3. 세션 invalidate() 처리
			session.invalidate();
		}

	// 4. 초기 화면으로 이동
	response.sendRedirect("/index");
	
	}

	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청된 HTTP 메소드 추출
		String method = request.getMethod();
			
		if ("GET".equals(method)) {
			// 1. 로그인을 하기 위한 화면 제공
			// 메인 컨텐트 위치 content 값 설정
			String mainContent = "/loginJsp";
			request.setAttribute("content", mainContent);
			
			// index 화면 뷰로 이동
			String view = "/header";
			request.getRequestDispatcher(view).forward(request, response);
			
		} else if ("POST".equals(method)) {
			// 로그인 처리
			// login.jsp 에서 넘어온 form 파라미터 추출
			String userId = request.getParameter("userId");
			String password = request.getParameter("password");
			
			if ("admin".equals(userId)||"superadmin".equals(userId)) {
				
				// 파라미터를 메니저 객체로 포장
				Admin admin = new Admin();
				admin.setAdminId(userId);
				admin.setPassword(password);
				
				// ManagerDao 객체 얻기
				AdminDaoIf dao = new AdminDaoImpl();
				
				 //dao 객체에 로그인 메소드 호출
				if (dao.login(admin)) {
					// 로그인 성공 : 세션 처리 ==> 기본 화면으로 이동
					HttpSession session = request.getSession(true);
					// login 시에는 HTTP 세션을 얻어낼 때 true 로 얻어내야 함
					
					// 세션에 메니저 아이디를 속성으로 추가 : 
					session.setAttribute("userId", userId);
					
			
					//  nextPage 설정
					String contextPath = "/adminHeader";
					request.setAttribute("contextPath", contextPath);
					
				
					
				} else {
					// 로그인 실패 : 메시지 처리 => 로그인 화면으로 다시 이동
					
					// 다시 로그인 시도하도록 로그인 화면으로 nextPage 설정
//						String nextPage = "/res?action=login";
//						request.setAttribute("nextPage", nextPage);
					
				}
					// 메인 화면 뷰 이동
				String view = "/adminIndex";
				request.getRequestDispatcher(view).forward(request, response);
				
				
			} else {
				// 파라미터를 메니저 객체로 포장
				Customer customer = new Customer();
				customer.setCustId(userId);
				customer.setPassword(password);
				
				// ManagerDao 객체 얻기
				CustomerDaoIf dao = new CustomerDaoImpl();
				
				 //dao 객체에 로그인 메소드 호출
				if (dao.login(customer)) {
					// 로그인 성공 : 세션 처리 ==> 기본 화면으로 이동
					HttpSession session = request.getSession(true);
					// login 시에는 HTTP 세션을 얻어낼 때 true 로 얻어내야 함
					
					// 세션에 메니저 아이디를 속성으로 추가 : 
					session.setAttribute("userId", userId);
					
			
					//  nextPage 설정
//					String contextPath = "/header";
//					request.setAttribute("contextPath", contextPath);
									
				} else {
					// 로그인 실패 : 메시지 처리 => 로그인 화면으로 다시 이동
					
					// 다시 로그인 시도하도록 로그인 화면으로 nextPage 설정
//						String nextPage = "/res?action=login";
//						request.setAttribute("nextPage", nextPage);
					
				}
				// 메인 화면 뷰 이동
				String view = "/index";
				request.getRequestDispatcher(view).forward(request, response);
			}
		}
	}



	private void selectFacility(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. dao 객체 얻기
		FacilityDaoIf dao = new FacilityDaoImpl();
		
		// 2. dao 객체에 목록 조회 메소드 호출 하여 결과 얻기
		List<Facility> facilitys = dao.select(null);
		
		// 3. 얻어진 결과 request 객체에 속성으로 추가
		request.setAttribute("facilitys", facilitys);
		
		// 4. 목록을 보여줄 수 있는 뷰로 forward
		// 메인 화면인 index 로 모든 포워딩을 전달
		String view = "/index";
		
		// 메인 컨텐트 영역에 바꿔 끼울 뷰를 선택
		String content = "/listFacility";
		// 컨엔트 영역에 끼울 뷰를 속성으로 요청 객체에 추가
		request.setAttribute("content", content);
		
		request.getRequestDispatcher(view).forward(request, response);
			
	}






	
}

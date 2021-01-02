<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    
    <%@ include file="/WEB-INF/views/common/header.jsp"%>
    
    <body class="sb-nav-fixed">
        
        <%@ include file="/WEB-INF/views/common/navBar.jsp"%>
        
        <div id="layoutSidenav">
            
        	<%@ include file="/WEB-INF/views/common/sideNavBar.jsp"%>    
            
            <div id="layoutSidenav_content">

				<main>
                    <div class="container-fluid">
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="/">Dashboard</a></li>
                            <li class="breadcrumb-item active">회원 조회</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                회원 조회
                            </div>
                            
                            <div class="container">
                            
	                            <table class="table table-hover">
	                            	<thead>
	                            		<tr>
	                            			<th width="10%">No</th>
	                            			<th width="40%">Email</th>
	                            			<th width="20%">닉네임</th>
	                            			<th width="20%">가입일</th>
	                            			<th width="10%">사용여부</th>
	                            		</tr>
	                            	</thead>
	                            	<tbody>
	                            		<c:if test="${empty userList}">
	                            			<tr class="text-center">
		                            			<td colspan="4">데이터가 없습니다</td>
		                            		<tr>
	                            		</c:if>
	                            		<c:if test="${!empty userList}">
		                            		<c:forEach var="userItem" items="${userList}">
		                            			<tr>
		                            				<td>${userItem.uIdx}</td>
		                            				<td>${userItem.userEmail}</td>
		                            				<td>${userItem.userNm}</td>
		                            				<!-- TimeStamp형식 처리 -->
		                            				<td><fmt:formatDate value="${userItem.cdate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
		                            				<td class="text-center">${userItem.useYn}</td>
		                            			</tr>	
		                            		</c:forEach>
	                            		</c:if>
	                            	</tbody>
	                            </table>
	                            
	                            <hr/>
	                            <a class="btn btn-primary float-right">글쓰기</a>
	                            
	                            <ul class="pagination justify-content-center">
								    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
								    <li class="page-item active"><a class="page-link" href="#">1</a></li>
								    <li class="page-item"><a class="page-link" href="#">2</a></li>
								    <li class="page-item"><a class="page-link" href="#">3</a></li>
								    <li class="page-item"><a class="page-link" href="#">Next</a></li>
								  </ul>
	                            
                            </div>
                            
                        </div>
                    </div>
                </main>
                
                <%@ include file="/WEB-INF/views/common/footer.jsp"%>
                
            </div>
        </div>
    </body>
</html>

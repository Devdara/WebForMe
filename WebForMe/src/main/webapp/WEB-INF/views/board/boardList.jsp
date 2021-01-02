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
                            <li class="breadcrumb-item active">일반게시판</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                일반 게시판
                            </div>
                            
                            <div class="container">
	                            <table class="table table-hover">
	                            	<thead>
	                            		<tr>
	                            			<th>No</th>
	                            			<th>제목</th>
	                            			<th>작성자</th>
	                            			<th>날짜</th>
	                            			<th>조회수</th>
	                            		</tr>
	                            	</thead>
	                            	<tbody>
	                            		<tr>
	                            			<td>1</td>
	                            			<td>테스트제목1</td>
	                            			<td>테스터1</td>
	                            			<td>2021.01.01</td>
	                            			<td>0</td>
	                            		<tr>
	                            		<tr>
	                            			<td>2</td>
	                            			<td>테스트제목2</td>
	                            			<td>테스터2</td>
	                            			<td>2021.01.02</td>
	                            			<td>1</td>
	                            		<tr>
	                            		<tr>
	                            			<td>3</td>
	                            			<td>테스트제목3</td>
	                            			<td>테스터3</td>
	                            			<td>2021.01.03</td>
	                            			<td>3</td>
	                            		<tr>
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

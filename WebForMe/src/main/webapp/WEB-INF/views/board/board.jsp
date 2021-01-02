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
                        <h1 class="mt-4">일반 게시판</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                            <li class="breadcrumb-item active">일반게시판</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-body">
                                일반 게시판 입니다
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                일반 게시판
                            </div>
                        </div>
                    </div>
                </main>
                
                <%@ include file="/WEB-INF/views/common/footer.jsp"%>
                
            </div>
        </div>
    </body>
</html>

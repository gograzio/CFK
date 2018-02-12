<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
	<head>
    	<meta charset=utf-8>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>오팀장과 형님들</title>
        
        <!-- Load Roboto font -->
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700&amp;subset=latin,latin-ext' rel='stylesheet' type='text/css'>
        
        <!-- Load css styles -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/bootstrap-responsive.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/style.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/jquery.cslider.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/jquery.bxslider.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/animate.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/jquery.popVideo.css"/>
    	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MainCss/pluton.css"/>
    	
        <!-- 팝업 기능과 디데이 기능 시작 -->    
        <script type="text/javascript">
        
        // 팝업 function
        function cookieVal(cookieName) {
        	thisCookie = document.cookie.split("; ");
        	for(i=0; i<thisCookie.length; i++) {
        		if(cookieName == thisCookie[i].split("=")[0]){
        			return thisCookie[i].split("=")[1];
        		}
        	}
        	return "x";
        }
        
		function Popupopen() {
			if(cookieVal("notice")!="1") {
		   		//팝업은 controller 거치지 않도록 resouces로 이동
				window.open("${pageContext.request.contextPath}/resources/popup.html", "notice", "width=500, height=615, top=0, left=0, location=no, scrollbars=yes");
			}
		}
			
		// 디데이 function
		var countDown = new Date("Feb 28, 2018 23:59:59").getTime();

		function msg_time() {	
			var now = new Date().getTime();		//현재 날짜
			var distance = countDown - now;		//d-day와 현재날짜 차이
			
			// 남은 시간 계산
			days = Math.floor(distance / (1000*60*60*24))+"일 ";
			hours = Math.floor((distance % (1000*60*60*24)) / (1000*60*60))+"시 ";
			minutes = Math.floor((distance % (1000*60*60)) / (1000*60))+"분 ";	
			seconds = Math.floor((distance % (1000*60)) / (1000))+"초";
			
			var msg = "<p><font color='white' size='3px'>D-DAY </font><font color='red' size='3px' text-align:center>"+days+hours+minutes+seconds+"</font></p>";
			
			// div 영역에 보여줌 
			document.getElementById("ViewTimer").innerHTML = msg;
			
			//distance--;					// 기간을 현재 날짜로 안가져올 경우의 1초씩 감소
			
			if (distance < 0) {			// 시간이 종료 되었으면..
				clearInterval(tid);		// 타이머 해제
				//alert("종료");
			} 
			
		}

		function TimerStart(){ tid=setInterval('msg_time()', 1000) };
		</script>
		<!-- 팝업 기능과 디데이 기능 끝 -->
    </head>
    
    <body onload="Popupopen(); TimerStart();">
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container">
                
                    <!-- This is website logo -->
                    <a href="/cfk" class="brand">
                        <img src="${pageContext.request.contextPath}/images/background/logo.png" width="120" height="40" alt="Logo" />   
                    </a>
                    
                    <!-- Navigation button, visible on small resolution -->
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <i class="icon-menu"></i>
                    </button>
                    
                    <!-- Main navigation -->
                    <div class="nav-collapse collapse pull-right">
                        <ul class="nav" id="top-navigation">
                        	<li style="margin-top: 15px;"><div id="ViewTimer"></div></li>                            
                            <li><a href="/cfk#service">함께하기</a></li>
                            <li><a href="/CFK/List.do#portfolio">투표하기</a></li>
                            <li><a href="/CFK/board/board_enter.jsp#service">참가신청</a></li>
                            <li><a href="/CFK/board/board_attend.jsp">방청신청</a></li>
                            <li><a href="/CFK/board/board_fashion.jsp">패션트렌드</a></li>
                            <li><a href="/CFK/index.jsp#contact">패션쇼</a></li>
                            <%-- <%
                            if(vo!=null){
                            %>	
                            	<li><a href="/CFK/Rank.do#service"><font color="yellow"><%=vo.getUser_name() %></font>님 로그인중</a></li>
                            	<li style="margin-top: 16px;"><button style="border-radius:50px;" onclick="location.href='logout.do'">logout</button></li>
                            <%	
                            }
							%> --%>
                        </ul>
                    </div>    
                </div>
            </div>
        </div>
	</body>
</html>
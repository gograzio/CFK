<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
</head>
    <body>
    	<%@ include file="../inc/header.jsp" %>
    	
        <div class="section secondary-section" id="service">
            <div class="container">
       			<div class="title">
        		<h1>회원가입</h1>            	
                <p>회원가입 하시면 많은 혜택을 누리실 수 있습니다.</p>                
        		</div>
        		<form:form action="/regist" name="userInfo" modelAttribute="userInfo">
        		<div align="center">
					<table>
						<tr>
							<td>
								<p><font color="black">아이디</font></p>
							</td>
							<td>
								<input type="text" name="user_id" value="${userInfo.user_id}" size="10" maxlength="12">
								<input type="button" value="중복확인" onClick="checkId(); "/>
								<form:errors path="user_id"/>
							</td>
						</tr>
						<tr>
							<td><p><font color="black">비밀번호</font></p></td>
							<td><input class="span5" type="password" name="user_passwd" maxlength="12">
							<form:errors path="user_passwd"/></td>
						</tr>
						<tr>
							<td><p><font color="black">비밀번호 확인</font></p></td>
							<td><input class="span5" type="password" name="user_chk_passwd" maxlength="12">
							<form:errors path="user_chk_passwd"/></td>
						</tr>
						<tr>
							<td><p><font color="black">이름</font></p></td>
							<td><input class="span5" type="text" name="user_name" value="${userInfo.user_name}" maxlength="12">
							<form:errors path="user_name"/></td>
						</tr>
						<tr>
							<td><p><font color="black">지역</font></p></td>
							<td>
								<select name="user_area" class="span5">
									<option selected disabled>----지역을 선택해주세요----</option>
									<option>서울.경기</option>
									<option>강원도</option>
									<option>충청권</option>
									<option>호남.제주</option>
									<option>영남권</option>			
								</select>
								<form:errors path="user_area"/>
							</td>
						</tr>
						<tr>
							<td><p><font color="black">나머지 주소</font></p></td>
							<td><input class="span5" type="text" name="user_addr" value="${userInfo.user_addr}" maxlength="50">
							<form:errors path="user_addr"/></td>
						</tr>
						<tr>
							<td><p><font color="black">전화번호</font></p></td>
							<td><input class="span5" type="text" name="user_tel" value="${userInfo.user_tel}" maxlength="30">
							<form:errors path="user_tel"/></td>
						</tr>
						<tr>
							<td><p><font color="black">나이</font></p></td>
							<td>
								<select name="user_age" class="span5">
									<option selected disabled>----나이를 선택해주세요----</option>
									<c:forEach var="i" begin="5" end="100" step="1">
										<option>${i}세</option>
									</c:forEach>
								</select>	
						</tr>
						<tr>
							<td><p><font color="black">이메일</font></p></td>
							<td><input class="span5" type="email" name="user_email" value="${userInfo.user_email}" placeholder="username@example.com" maxlength="30">
							<form:errors path="user_email"/></td>
						</tr>
						<tr>
							<td><p><font color="black">성별</font></p></td>
							<td align="center" style="letter-spacing:50px">
								<input type="radio" name="user_gender" value="남" checked><font color="black">남</font>
								<input type="radio" name="user_gender" value="여"><font color="black">여</font>
							</td>
						</tr>
						<tr>
							<td align="center" colspan="2" class="btn_align">
								<input class="message-btn" type="submit" value="가입하기">
								<input class="message-btn" type="reset" value="새로입력" onclick="location.href='/cfk/regist'">
								<input class="message-btn" type="button" value="취소" onclick="javascript:history.back();">
							</td>
						</tr>
					</table>
				</div>	
				</form:form>
        	</div>
        </div>
        
        <%@ include file="../inc/footer.jsp" %>
    </body>
</html>
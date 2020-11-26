<%-- 
    Document   : home.jsp
    Created on : Nov 17, 2020, 8:37:44 PM
    Author     : Lrandom
--%>


<%@page import="models.SandalLao"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sw" uri="/WEB-INF/tlds/utils.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<fmt:setLocale value="vi-VN"/>
<fmt:bundle basename="bundle.main"/>
<!DOCTYPE html>
<html>  
    <jsp:include page="commons/nav.jsp"/>
    <body>
        <jsp:include page="commons/header.jsp"/>


        <div class="container" style="margin-top:10px">            
            <div class="row">
               
            
                     <%--tongLao la bien phan ra tu list--%>
            <%--list la bien day tu servlet vao--%>
            <c:forEach var="tongLao" items="${list}">                
                 <div class="col-12 col-md-3 item">
                    <img src="${tongLao.getPicture()}"/>
                    
                    <div>
                        <h4>${tongLao.getName()}</h4>
                        <div><fmt:formatNumber value="${tongLao.getPrice()}" type="currency"/></div>
                    </div>
                    
                    <div>
                        <a href="/shopTongLao/add-to-cart?id=${tongLao.getId()}" class="btn btn-primary" style="color:white">Add To Cart</a>
                    </div>
                 </div>
                
            </c:forEach>
            </div>
        </div>


        <sw:BlockSwearWord content="Hello, fuck, mother fucker, hi">
            
        </sw:BlockSwearWord> 
            
        <footer style="text-align:center">Copyright 2020 NIIT JAVA 16</footer>
    </body>
    
    <style>
        .item{
            overflow:hidden;
            
        }
        
        .item img{
            width:100%;
        }
    </style>
    
</html>

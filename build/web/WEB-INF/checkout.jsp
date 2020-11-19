<%-- 
    Document   : home.jsp
    Created on : Nov 17, 2020, 8:37:44 PM
    Author     : Lrandom
--%>


<%@page import="models.SandalLao"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<fmt:setLocale value="vi-VN"/>
<!DOCTYPE html>
<html>  
    <jsp:include page="commons/nav.jsp"/>
    <body>
        <jsp:include page="commons/header.jsp"/>


        <div class="container" style="margin-top:10px">            
            <div class="row">
               
            
                     <%--tongLao la bien phan ra tu list--%>
            <%--list la bien day tu servlet vao--%>
            <table class="table">
                <tr>
                      <th>Picture</th>
                      <th>Name</th>
                      <th>Price</th>
                      <th>Quantity</th>
                      <th>Operation</th>
                </tr>
                
                
                <c:forEach var="tongLao" items="${itemInCart}">                
                    <tr>
                        <td>
                            <img src="${tongLao.getSandalLao().getPicture()}" width="100"/>
                   
                        </td>
                        
                        <td>
                            ${tongLao.getSandalLao().getName()}
                        </td>
                        
                        <td>
                            <fmt:formatNumber type="currency" value="${tongLao.getSandalLao().getPrice()}"/>
                            
                        </td>
                        
                        <td>${tongLao.getQuantity()}</td>
                        
                        <td>
                            
                        </td>
                    </tr>       
                </c:forEach>
            </table>
            
            
            </div>
        </div>


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

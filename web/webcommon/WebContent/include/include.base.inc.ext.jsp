<%@page import="so.wwb.creditbox.web.tools.SessionManagerCommon" %>

<c:set var="logo" value="<%= SessionManagerCommon.getLogo() %>"/>
<c:set var="flashLogo" value="<%= SessionManagerCommon.getFlashLogo() %>"/>
<c:set var="sessionSysUser" value="<%= SessionManagerCommon.getUser() %>"/>
<c:set var="sessionSiteId" value="<%=SessionManagerCommon.getSiteId() %>"/>
<c:set var="siteName" value="<%=SessionManagerCommon.getSiteDomainName(request) %>"/>
<c:set var="siteTilte" value="<%=SessionManagerCommon.getSiteDomainTilte(request)%>"/>
<c:set var="siteDomain" value="<%=SessionManagerCommon.getSiteDomain(request) %>"/>

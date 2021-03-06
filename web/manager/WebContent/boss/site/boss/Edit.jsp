<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="/include/include.inc.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>编辑</title>
    <%@ include file="/include/include.head.jsp" %>
</head>

<body>
<form:form method="post" id="siteBossEdit">
    <lb:validateRule/>
    <lb:token/>
    <form:input type="hidden" path="result.id" value="${result.id}"/>
    <div class="modal-body">
        <div class="form-group over clearfix">
            <label class="col-xs-3 al-right line-hi34">备注：</label>
            <div class="input-group m-b col-xs-9">
                <form:textarea class="form-control" path="result.remark" value="${result.remark}"></form:textarea>
            </div>
        </div>
    </div>
    <div class="modal-footer">
        <soul:button precall="validateForm" cssClass="btn btn-filter"
                     callback="saveCallbak" text="保存"
                     opType="ajax" dataType="json" target="${root}/site/siteBoss/updateSiteBoss.html"
                     post="getCurrentFormData"/>
        <soul:button target="closePage" text="取消" returnValue="false"  cssClass="btn btn-outline btn-filter" opType="function"/>
    </div>
</form:form>
</body>
<%@ include file="/include/include.js.jsp" %>
<soul:import res="site/boss/site/boss/Edit"/>
</html>
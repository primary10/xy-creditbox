<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="/include/include.inc.jsp" %>
<div class="row">
    <form:form id="viewDomainFormAgent" action="${root}/site/merchantSiteDetail/domainAfent.html?search.siteId=${getSiteId}&searchType=2"
               method="post">
        <div class="position-wrap clearfix">
            <span>站点</span><span>/</span><span>商户域名</span>
            <span>/</span><span>总代域名</span>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a nav-target="mainFrame" href="/site/siteMerChant/list.html">
                <span style="background-color: #bababa;border-color: #bababa;color: #FFFFFF;width: 65px;">
                    <em class="fa fa-caret-left"></em>返回</span></a>
        </div>

        <div class="m-b-xs clearfix">
            <div class="form-group clearfix pull-left col-md-2 col-sm-12 m-b-sm padding-r-none-sm">
                <div class="input-group date">
                    <span class="input-group-addon bg-gray">名称</span>
                    <input type="text" class="form-control list-search-input-text" name="search.name" value="${command.search.name}">
                </div>
            </div>
            <div class="form-group clearfix pull-left col-md-2 col-sm-12 m-b-sm padding-r-none-sm">
                <div class="input-group date">
                    <span class="input-group-addon bg-gray">域名</span>
                    <input type="text" class="form-control list-search-input-text" name="search.domain" value="${command.search.domain}">
                </div>
            </div>
            <div class="form-group clearfix pull-left col-md-1 col-sm-12 m-b-sm padding-r-none-sm">
                <div class="input-group date">
                        <soul:button target="${root}/account/domain/distributorCreate.html?search.siteId=${getSiteId}&search.sysUserId=${sysUserId}"
                                     opType="dialog" text="新增"
                                     cssClass="btn btn-info btn-addon" callback="callBackQuery" permission="domain:create_domain">
                            <i class="fa fa-plus"></i>新增</soul:button>
                </div>
            </div>
            <div class="form-group clearfix pull-left col-md-2 col-sm-12 m-b-sm padding-r-none-sm">
                <div class="input-group date">
                    <soul:button cssClass="btn btn-filter" precall="" tag="button" opType="function"
                                 text="查询" target="query">
                        <i class="fa fa-search"></i><span class="hd">&nbsp;查询</span>
                    </soul:button>
                </div>
            </div>
        </div>
        <div class="col-lg-12 m-t">
            <div class="wrapper white-bg shadow">
                <div class="search-list-container">
                    <%@include file="PartialDomainAgent.jsp" %>
                </div>
            </div>
        </div>
    </form:form>
    <soul:import res="site/boss/site/company/detail/ViewDomainAgent"/>
</div>
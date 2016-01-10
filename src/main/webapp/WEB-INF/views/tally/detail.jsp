<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/static/core/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>帐单明细查询</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/wallet/detail.js"></script>
<script type="text/javascript">

</script>

</head>
<body>
	<div id="detail-layout" fit="true" class="easyui-layout" border = "false">
        <div data-options="region:'north',title:'帐单明细查询'" style="height: 80px;">
        	<form action="">
        		帐目分类:<select id="account_types"></select>
        	</form>
        </div>
        <div data-options="region:'center',title:'帐单明细'" border = "false">
        	<table id="dg"></table>
        </div>
    </div>
    
<!--     <div id="dlg" class="easyui-dialog" title="Toolbar and Buttons" style="width:400px;height:200px;padding:10px" -->
<!--             data-options=" -->
<!--                 iconCls: 'icon-save', -->
<!--                 toolbar: [{ -->
<!--                     text:'Add', -->
<!--                     iconCls:'icon-add', -->
<!--                     handler:function(){ -->
<!--                         alert('add') -->
<!--                     } -->
<!--                 },'-',{ -->
<!--                     text:'Save', -->
<!--                     iconCls:'icon-save', -->
<!--                     handler:function(){ -->
<!--                         alert('save') -->
<!--                     } -->
<!--                 }], -->
<!--                 buttons: [{ -->
<!--                     text:'Ok', -->
<!--                     iconCls:'icon-ok', -->
<!--                     handler:function(){ -->
<!--                         alert('ok'); -->
<!--                     } -->
<!--                 },{ -->
<!--                     text:'Cancel', -->
<!--                     handler:function(){ -->
<!--                         alert('cancel');; -->
<!--                     } -->
<!--                 }] -->
<!--             "> -->
<!--         The dialog content. -->
<!--     </div> -->
    
</body>
</html>
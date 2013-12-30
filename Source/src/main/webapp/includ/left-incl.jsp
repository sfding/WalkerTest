<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="span3">
			<ul class="nav nav-tabs nav-stacked">
				<li id="walker-navigation"><a href="/back/navigation/list.do?page=1">导航管理</a></li>
				<li id="walker-product"><a href="/back/product/list.do?page=1">产品管理</a></li>
				<li id="walker-ad"><a href="/back/ad/list.do?page=1">广告管理</a></li>
				<li id="walker-news"><a href="/back/news/list.do?page=1">新闻公告管理</a></li>
			</ul>
		</div>
<script type="text/javascript">
		$("#" + active_menu).addClass("active");
</script>
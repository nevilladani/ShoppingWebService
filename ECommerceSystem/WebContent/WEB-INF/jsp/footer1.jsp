<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript">
	function lazyload(option) {
		var settings = {
			defObj : null,
			defHeight : 0
		};
		settings = $.extend(settings, option || {});
		var defHeight = settings.defHeight, defObj = (typeof settings.defObj == "object") ? settings.defObj
				.find("img")
				: $(settings.defObj).find("img");
		var pageTop = function() {
			var d = document, y = (navigator.userAgent.toLowerCase().match(
					/iPad/i) == "ipad") ? window.pageYOffset : Math.max(
					d.documentElement.scrollTop, d.body.scrollTop);
			return d.documentElement.clientHeight + y - settings.defHeight
		};
		var imgLoad = function() {
			defObj.each(function() {
				if ($(this).offset().top <= pageTop()) {
					var src2 = $(this).attr("src2");
					if (src2) {
						$(this).attr("src", src2).removeAttr("src2")
					}
				}
			})
		};
		imgLoad();
		$(window).bind("scroll", function() {
			imgLoad()
		})
	}
	lazyload({
		defObj : "#plist"
	})
</script>
<div class="right" >
	<div class="m" id="sortlist"
		clstag="thirdtype|keycount|thirdtype|sortlist">

		<div class="mt">
			<h2>Computer & Facilities</h2>
		</div>
		<div class="mc">
			<div class="item current">
				<h3>
					<b></b>Computer
				</h3>
				<ul>
					<li><a
						href="${pageContext.request.contextPath }/web.controller/ListProductServlet">Laptop</a>
					</li>
					<li><a href="">Pad</a>
					</li>
					<li><a href="">Desktop</a>
					</li>
				</ul>
			</div>
			<div class="item current">
				<h3>
					<b></b>Facilitates
				</h3>
				<ul>
					<li><a href="">CPU</a>
					</li>
					<li><a href="">Main Borad</a>
					</li>
					<li><a href="">Screen Card</a>
					</li>
					<li><a href="">Harddrive</a>
					</li>
					<li><a href="">Memory</a>
					</li>
				</ul>
			</div>
			<div class="item current">
				<h3>
					<b></b>IO
				</h3>
				<ul>
					<li><a href="">Flash</a>
					</li>
					<li><a href="">Keyboard</a>
					</li>
					<li><a href="">USB</a>
					</li>
					<li><a href="">Mouse</a>
					</li>
				</ul>
			</div>
			<div class="item current">
				<h3>
					<b></b>Software
				</h3>
				<ul>
					<li><a href="">Window 8</a>
					</li>
					<li><a href="">Mac OS 11</a>
					</li>
					<li><a href="">Photoshop</a>
					</li>
					<li><a href="">Illustrator</a>
					</li>
				</ul>
			</div>
		</div>

	</div>
	<!--sortlist end-->

	<script type="text/javascript">
		$("#sortlist h3").bind("click", function() {
			var element = $(this).parent();
			if (element.hasClass("current")) {
				element.removeClass("current");
			} else {
				element.addClass("current");
			}
		})
	</script>

	
	<span class="clr"></span>
	<div id="Collect_Tip" class="Tip360 w260"></div>
</div>



<script type="text/javascript"
	src="http://misc.360buyimg.com/lib/js/2012/lib-v1.js?t=20120809"></script>
<script type="text/javascript">
	$("#store-selector").Jdropdown();
</script>
<script type="text/javascript">
	$.jdCalcul([ 535 ]);
</script>
<script type="text/javascript">
	pageConfig.FN_InitContrast();
</script>
<script type="text/javascript"
	src="http://misc.360buyimg.com/201007/js/p.plist20121206.js"></script>
<script type="text/javascript"
	src="http://simigoods.360buy.com/js/BiForWeb.js"></script>
<script type="text/javascript"
	src="http://misc.360buyimg.com/product/js/2012/footprint.js"></script>
<script type="text/javascript">
	(function() {
		var ref = document.referrer;
		if (ref && ref.indexOf("jd.com") == -1
				&& ref.indexOf("360buy.com") == -1) {
			ListRecP(672);
		}
	})();
	function feed_publish_collect(type, wid) {
		jQuery.getJSON("http://i.360buy.com/feed/send.action?type=" + type
				+ "&commodityId=" + wid + "&jsoncallback=?", function(json) {
		})
	}
	if ($("#hotsale").length > 0) {
		log('thirdtype', 'showhotsale_M');
	}
</script>

<script type="text/javascript"
	src="http://simigoods.360buy.com/js/ThridRec.js?t=20121129"></script>
<script type="text/javascript"
	src="http://fa.jd.com/loadFa_toJson.js?aid=2_145_764-2_145_837"></script>
<script type="text/javascript"
	src="http://www.jd.com/hotwords.aspx?Position=A-computer-011"></script>

<script type="text/javascript" src="http://wl.jd.com/wl.js"></script>
<script type="text/javascript">
	var _mvq = _mvq || [];
	_mvq.push([ '$setAccount', 'm-9-1' ]);
	_mvq.push([ '$logConversion' ]);
	(function() {
		var mvl = document.createElement('script');
		mvl.type = 'text/javascript';
		mvl.async = true;
		mvl.src = 'http://misc.360buyimg.com/lib/js/2012/mvl.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(mvl, s);
	})();
</script>



</body>
</html>
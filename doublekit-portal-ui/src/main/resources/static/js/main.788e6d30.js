!function(e){function n(n){for(var r,o,u=n[0],a=n[1],i=n[2],l=0,j=[];l<u.length;l++)o=u[l],Object.prototype.hasOwnProperty.call(s,o)&&s[o]&&j.push(s[o][0]),s[o]=0;for(r in a)Object.prototype.hasOwnProperty.call(a,r)&&(e[r]=a[r]);for(f&&f(n);j.length;)j.shift()();return c.push.apply(c,i||[]),t()}function t(){for(var e,n=0;n<c.length;n++){for(var t=c[n],r=!0,o=1;o<t.length;o++){var a=t[o];0!==s[a]&&(r=!1)}r&&(c.splice(n--,1),e=u(u.s=t[0]))}return e}var r={},o={0:0},s={0:0},c=[];function u(n){if(r[n])return r[n].exports;var t=r[n]={i:n,l:!1,exports:{}};return e[n].call(t.exports,t,t.exports,u),t.l=!0,t.exports}u.e=function(e){var n=[];o[e]?n.push(o[e]):0!==o[e]&&{4:1}[e]&&n.push(o[e]=new Promise((function(n,t){for(var r="css/"+({}[e]||e)+".css",s=u.p+r,c=document.getElementsByTagName("link"),a=0;a<c.length;a++){var i=(f=c[a]).getAttribute("data-href")||f.getAttribute("href");if("stylesheet"===f.rel&&(i===r||i===s))return n()}var l=document.getElementsByTagName("style");for(a=0;a<l.length;a++){var f;if((i=(f=l[a]).getAttribute("data-href"))===r||i===s)return n()}var j=document.createElement("link");j.rel="stylesheet",j.type="text/css";j.onerror=j.onload=function(r){if(j.onerror=j.onload=null,"load"===r.type)n();else{var c=r&&("load"===r.type?"missing":r.type),u=r&&r.target&&r.target.href||s,a=new Error("Loading CSS chunk "+e+" failed.\n("+u+")");a.code="CSS_CHUNK_LOAD_FAILED",a.type=c,a.request=u,delete o[e],j.parentNode.removeChild(j),t(a)}},j.href=s,document.head.appendChild(j)})).then((function(){o[e]=0})));var t=s[e];if(0!==t)if(t)n.push(t[2]);else{var r=new Promise((function(n,r){t=s[e]=[n,r]}));n.push(t[2]=r);var c,a=document.createElement("script");a.charset="utf-8",a.timeout=120,u.nc&&a.setAttribute("nonce",u.nc),a.src=function(e){return u.p+"js/"+({}[e]||e)+".788e6d30.js"}(e);var i=new Error;c=function(n){a.onerror=a.onload=null,clearTimeout(l);var t=s[e];if(0!==t){if(t){var r=n&&("load"===n.type?"missing":n.type),o=n&&n.target&&n.target.src;i.message="Loading chunk "+e+" failed.\n("+r+": "+o+")",i.name="ChunkLoadError",i.type=r,i.request=o,t[1](i)}s[e]=void 0}};var l=setTimeout((function(){c({type:"timeout",target:a})}),12e4);a.onerror=a.onload=c,document.head.appendChild(a)}return Promise.all(n)},u.m=e,u.c=r,u.d=function(e,n,t){u.o(e,n)||Object.defineProperty(e,n,{enumerable:!0,get:t})},u.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},u.t=function(e,n){if(1&n&&(e=u(e)),8&n)return e;if(4&n&&"object"==typeof e&&e&&e.__esModule)return e;var t=Object.create(null);if(u.r(t),Object.defineProperty(t,"default",{enumerable:!0,value:e}),2&n&&"string"!=typeof e)for(var r in e)u.d(t,r,function(n){return e[n]}.bind(null,r));return t},u.n=function(e){var n=e&&e.__esModule?function(){return e.default}:function(){return e};return u.d(n,"a",n),n},u.o=function(e,n){return Object.prototype.hasOwnProperty.call(e,n)},u.p="/",u.oe=function(e){throw console.error(e),e};var a=window.webpackJsonp=window.webpackJsonp||[],i=a.push.bind(a);a.push=n,a=a.slice();for(var l=0;l<a.length;l++)n(a[l]);var f=i;c.push([508,1]),t()}({508:function(e,n,t){e.exports=t(787)},555:function(e,n,t){var r={"./af":335,"./af.js":335,"./ar":336,"./ar-dz":337,"./ar-dz.js":337,"./ar-kw":338,"./ar-kw.js":338,"./ar-ly":339,"./ar-ly.js":339,"./ar-ma":340,"./ar-ma.js":340,"./ar-sa":341,"./ar-sa.js":341,"./ar-tn":342,"./ar-tn.js":342,"./ar.js":336,"./az":343,"./az.js":343,"./be":344,"./be.js":344,"./bg":345,"./bg.js":345,"./bm":346,"./bm.js":346,"./bn":347,"./bn-bd":348,"./bn-bd.js":348,"./bn.js":347,"./bo":349,"./bo.js":349,"./br":350,"./br.js":350,"./bs":351,"./bs.js":351,"./ca":352,"./ca.js":352,"./cs":353,"./cs.js":353,"./cv":354,"./cv.js":354,"./cy":355,"./cy.js":355,"./da":356,"./da.js":356,"./de":357,"./de-at":358,"./de-at.js":358,"./de-ch":359,"./de-ch.js":359,"./de.js":357,"./dv":360,"./dv.js":360,"./el":361,"./el.js":361,"./en-au":362,"./en-au.js":362,"./en-ca":363,"./en-ca.js":363,"./en-gb":364,"./en-gb.js":364,"./en-ie":365,"./en-ie.js":365,"./en-il":366,"./en-il.js":366,"./en-in":367,"./en-in.js":367,"./en-nz":368,"./en-nz.js":368,"./en-sg":369,"./en-sg.js":369,"./eo":370,"./eo.js":370,"./es":371,"./es-do":372,"./es-do.js":372,"./es-mx":373,"./es-mx.js":373,"./es-us":374,"./es-us.js":374,"./es.js":371,"./et":375,"./et.js":375,"./eu":376,"./eu.js":376,"./fa":377,"./fa.js":377,"./fi":378,"./fi.js":378,"./fil":379,"./fil.js":379,"./fo":380,"./fo.js":380,"./fr":381,"./fr-ca":382,"./fr-ca.js":382,"./fr-ch":383,"./fr-ch.js":383,"./fr.js":381,"./fy":384,"./fy.js":384,"./ga":385,"./ga.js":385,"./gd":386,"./gd.js":386,"./gl":387,"./gl.js":387,"./gom-deva":388,"./gom-deva.js":388,"./gom-latn":389,"./gom-latn.js":389,"./gu":390,"./gu.js":390,"./he":391,"./he.js":391,"./hi":392,"./hi.js":392,"./hr":393,"./hr.js":393,"./hu":394,"./hu.js":394,"./hy-am":395,"./hy-am.js":395,"./id":396,"./id.js":396,"./is":397,"./is.js":397,"./it":398,"./it-ch":399,"./it-ch.js":399,"./it.js":398,"./ja":400,"./ja.js":400,"./jv":401,"./jv.js":401,"./ka":402,"./ka.js":402,"./kk":403,"./kk.js":403,"./km":404,"./km.js":404,"./kn":405,"./kn.js":405,"./ko":406,"./ko.js":406,"./ku":407,"./ku.js":407,"./ky":408,"./ky.js":408,"./lb":409,"./lb.js":409,"./lo":410,"./lo.js":410,"./lt":411,"./lt.js":411,"./lv":412,"./lv.js":412,"./me":413,"./me.js":413,"./mi":414,"./mi.js":414,"./mk":415,"./mk.js":415,"./ml":416,"./ml.js":416,"./mn":417,"./mn.js":417,"./mr":418,"./mr.js":418,"./ms":419,"./ms-my":420,"./ms-my.js":420,"./ms.js":419,"./mt":421,"./mt.js":421,"./my":422,"./my.js":422,"./nb":423,"./nb.js":423,"./ne":424,"./ne.js":424,"./nl":425,"./nl-be":426,"./nl-be.js":426,"./nl.js":425,"./nn":427,"./nn.js":427,"./oc-lnc":428,"./oc-lnc.js":428,"./pa-in":429,"./pa-in.js":429,"./pl":430,"./pl.js":430,"./pt":431,"./pt-br":432,"./pt-br.js":432,"./pt.js":431,"./ro":433,"./ro.js":433,"./ru":434,"./ru.js":434,"./sd":435,"./sd.js":435,"./se":436,"./se.js":436,"./si":437,"./si.js":437,"./sk":438,"./sk.js":438,"./sl":439,"./sl.js":439,"./sq":440,"./sq.js":440,"./sr":441,"./sr-cyrl":442,"./sr-cyrl.js":442,"./sr.js":441,"./ss":443,"./ss.js":443,"./sv":444,"./sv.js":444,"./sw":445,"./sw.js":445,"./ta":446,"./ta.js":446,"./te":447,"./te.js":447,"./tet":448,"./tet.js":448,"./tg":449,"./tg.js":449,"./th":450,"./th.js":450,"./tk":451,"./tk.js":451,"./tl-ph":452,"./tl-ph.js":452,"./tlh":453,"./tlh.js":453,"./tr":454,"./tr.js":454,"./tzl":455,"./tzl.js":455,"./tzm":456,"./tzm-latn":457,"./tzm-latn.js":457,"./tzm.js":456,"./ug-cn":458,"./ug-cn.js":458,"./uk":459,"./uk.js":459,"./ur":460,"./ur.js":460,"./uz":461,"./uz-latn":462,"./uz-latn.js":462,"./uz.js":461,"./vi":463,"./vi.js":463,"./x-pseudo":464,"./x-pseudo.js":464,"./yo":465,"./yo.js":465,"./zh-cn":466,"./zh-cn.js":466,"./zh-hk":467,"./zh-hk.js":467,"./zh-mo":468,"./zh-mo.js":468,"./zh-tw":469,"./zh-tw.js":469};function o(e){var n=s(e);return t(n)}function s(e){if(!t.o(r,e)){var n=new Error("Cannot find module '"+e+"'");throw n.code="MODULE_NOT_FOUND",n}return r[e]}o.keys=function(){return Object.keys(r)},o.resolve=s,e.exports=o,o.id=555},787:function(e,n,t){"use strict";t.r(n);var r=t(24),o=t.n(r),s=t(0),c=t.n(s),u=t(54),a=t.n(u),i=t(121),l=t(46),f=t(113),j=t.n(f),p=t(64),h=t.n(p),m=t(65),d=t.n(m),b=t(221),g=t.n(b),y=t(222),v=t.n(y),w=t(196),O=t.n(w),P=t(47),k=t.n(P);function z(e){var n=function(){if("undefined"==typeof Reflect||!Reflect.construct)return!1;if(Reflect.construct.sham)return!1;if("function"==typeof Proxy)return!0;try{return Boolean.prototype.valueOf.call(Reflect.construct(Boolean,[],(function(){}))),!0}catch(e){return!1}}();return function(){var t,r=O()(e);if(n){var o=O()(this).constructor;t=Reflect.construct(r,arguments,o)}else t=r.apply(this,arguments);return v()(this,t)}}function x(e){return function(n){g()(o,n);var t,r=z(o);function o(e){var n;return h()(this,o),(n=r.call(this,e)).state={component:null},n}return d()(o,[{key:"componentDidMount",value:(t=j()(k.a.mark((function n(){var t,r;return k.a.wrap((function(n){for(;;)switch(n.prev=n.next){case 0:return n.next=2,e();case 2:t=n.sent,r=t.default,this.setState({component:r});case 5:case"end":return n.stop()}}),n,this)}))),function(){return t.apply(this,arguments)})},{key:"render",value:function(){var e=this.state.component;return e&&c.a.createElement(e,this.props)}}]),o}(s.Component)}var E=x((function(){return new Promise((function(e){t.e(5).then(function(n){e(t(811))}.bind(null,t)).catch(t.oe)}))})),S=x((function(){return new Promise((function(e){t.e(6).then(function(n){e(t(791))}.bind(null,t)).catch(t.oe)}))})),_=x((function(){return new Promise((function(e){t.e(12).then(function(n){e(t(792))}.bind(null,t)).catch(t.oe)}))})),D=x((function(){return new Promise((function(e){t.e(11).then(function(n){e(t(793))}.bind(null,t)).catch(t.oe)}))})),R=x((function(){return new Promise((function(e){t.e(4).then(function(n){e(t(810))}.bind(null,t)).catch(t.oe)}))})),C=x((function(){return new Promise((function(e){t.e(7).then(function(n){e(t(794))}.bind(null,t)).catch(t.oe)}))})),L=x((function(){return new Promise((function(e){t.e(2).then(function(n){e(t(795))}.bind(null,t)).catch(t.oe)}))})),M=x((function(){return new Promise((function(e){t.e(8).then(function(n){e(t(796))}.bind(null,t)).catch(t.oe)}))})),T=x((function(){return new Promise((function(e){t.e(10).then(function(n){e(t(797))}.bind(null,t)).catch(t.oe)}))})),A=x((function(){return new Promise((function(e){t.e(9).then(function(n){e(t(798))}.bind(null,t)).catch(t.oe)}))})),N=x((function(){return new Promise((function(e){t.e(3).then(function(n){e(t(799))}.bind(null,t)).catch(t.oe)}))})),B=x((function(){return new Promise((function(e){t.e(17).then(function(n){e(t(800))}.bind(null,t)).catch(t.oe)}))})),q=x((function(){return new Promise((function(e){t.e(14).then(function(n){e(t(801))}.bind(null,t)).catch(t.oe)}))})),U=x((function(){return new Promise((function(e){t.e(13).then(function(n){e(t(802))}.bind(null,t)).catch(t.oe)}))})),F=x((function(){return new Promise((function(e){t.e(18).then(function(n){e(t(803))}.bind(null,t)).catch(t.oe)}))})),H=[{path:"/",exact:!0,render:function(){return c.a.createElement(l.Redirect,{to:"/work"})}},{path:"/logout",exact:!0,component:S},{component:C,exact:!0,path:"/login"},{component:E,key:"layout",routes:[{component:R,path:"/work",exact:!0},{component:_,path:"/setting",routes:[{path:"/setting/about",component:D,exact:!0},{path:"/setting",exact:!0,render:function(){return c.a.createElement(l.Redirect,{to:"/setting/about"})}}]},{component:L,path:"/orga",routes:[{path:"/orga/dashbord",component:M},{path:"/orga/user",component:T},{path:"/orga/peojectpeople",component:A},{path:"/orga",exact:!0,render:function(){return c.a.createElement(l.Redirect,{to:"/orga/dashbord"})}}]},{component:N,path:"/system",routes:[{path:"/system/feature",component:q},{path:"/system/role",component:x((function(){return new Promise((function(e){t.e(20).then(function(n){e(t(804))}.bind(null,t)).catch(t.oe)}))}))},{path:"/system/projectfeature",component:B},{path:"/system/projectrole",component:F},{path:"/system/projectrolecustom",component:U},{path:"/system/message",component:x((function(){return new Promise((function(e){t.e(15).then(function(n){e(t(805))}.bind(null,t)).catch(t.oe)}))}))},{path:"/system/messagetype",component:x((function(){return new Promise((function(e){t.e(16).then(function(n){e(t(806))}.bind(null,t)).catch(t.oe)}))}))},{path:"/system/user",component:x((function(){return new Promise((function(e){t.e(22).then(function(n){e(t(807))}.bind(null,t)).catch(t.oe)}))}))},{path:"/system/messagesendtype",component:x((function(){return new Promise((function(e){t.e(19).then(function(n){e(t(808))}.bind(null,t)).catch(t.oe)}))}))},{path:"/system/messagetemplate",component:x((function(){return new Promise((function(e){t.e(21).then(function(n){e(t(809))}.bind(null,t)).catch(t.oe)}))}))},{path:"/system",exact:!0,render:function(){return c.a.createElement(l.Redirect,{to:"/system/feature"})}}]}]}],I=t(317),J=t(53);var K={},V=t(205),G=t(103),Q=t(126),W=t(206),X=t(116);function Y(e,n){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);n&&(r=r.filter((function(n){return Object.getOwnPropertyDescriptor(e,n).enumerable}))),t.push.apply(t,r)}return t}function Z(e){for(var n=1;n<arguments.length;n++){var t=null!=arguments[n]?arguments[n]:{};n%2?Y(Object(t),!0).forEach((function(n){o()(e,n,t[n])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):Y(Object(t)).forEach((function(n){Object.defineProperty(e,n,Object.getOwnPropertyDescriptor(t,n))}))}return e}var $={zh:{translation:Z(Z(Z(Z({},W.orga_cn),V.portal_cn),G.privilege_cn),Q.message_cn)}},ee=t(316),ne=t(505),te=t(506),re=t(58);ee.a.use(te.a).use(ne.a).use(re.g).init({resources:$,fallbackLng:"zh",lng:"zh",debug:!1,interpolation:{escapeValue:!1}});ee.a;function oe(e,n){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);n&&(r=r.filter((function(n){return Object.getOwnPropertyDescriptor(e,n).enumerable}))),t.push.apply(t,r)}return t}function se(e){for(var n=1;n<arguments.length;n++){var t=null!=arguments[n]?arguments[n]:{};n%2?oe(Object(t),!0).forEach((function(n){o()(e,n,t[n])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):oe(Object(t)).forEach((function(n){Object.defineProperty(e,n,Object.getOwnPropertyDescriptor(t,n))}))}return e}var ce=function(){var e=se(se(se(se(se({},K),V.stores),G.privilegeStores),Q.messageModuleStores),W.orgStores);return Object(X.useLoadLanguage)($,"post","/plugin/getPluginConfig","zh"),c.a.createElement(J.Provider,e,c.a.createElement(i.HashRouter,null,Object(I.a)(Object(X.handelPluginRouter)(H,[]))))};a.a.render(c.a.createElement(ce,null),document.getElementById("root"))}});
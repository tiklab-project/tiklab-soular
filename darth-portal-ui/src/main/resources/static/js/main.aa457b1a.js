!function(e){function t(t){for(var r,o,a=t[0],i=t[1],l=t[2],s=0,p=[];s<a.length;s++)o=a[s],Object.prototype.hasOwnProperty.call(c,o)&&c[o]&&p.push(c[o][0]),c[o]=0;for(r in i)Object.prototype.hasOwnProperty.call(i,r)&&(e[r]=i[r]);for(f&&f(t);p.length;)p.shift()();return u.push.apply(u,l||[]),n()}function n(){for(var e,t=0;t<u.length;t++){for(var n=u[t],r=!0,o=1;o<n.length;o++){var i=n[o];0!==c[i]&&(r=!1)}r&&(u.splice(t--,1),e=a(a.s=n[0]))}return e}var r={},o={0:0},c={0:0},u=[];function a(t){if(r[t])return r[t].exports;var n=r[t]={i:t,l:!1,exports:{}};return e[t].call(n.exports,n,n.exports,a),n.l=!0,n.exports}a.e=function(e){var t=[];o[e]?t.push(o[e]):0!==o[e]&&{2:1}[e]&&t.push(o[e]=new Promise((function(t,n){for(var r="css/"+({}[e]||e)+".css",c=a.p+r,u=document.getElementsByTagName("link"),i=0;i<u.length;i++){var l=(f=u[i]).getAttribute("data-href")||f.getAttribute("href");if("stylesheet"===f.rel&&(l===r||l===c))return t()}var s=document.getElementsByTagName("style");for(i=0;i<s.length;i++){var f;if((l=(f=s[i]).getAttribute("data-href"))===r||l===c)return t()}var p=document.createElement("link");p.rel="stylesheet",p.type="text/css";p.onerror=p.onload=function(r){if(p.onerror=p.onload=null,"load"===r.type)t();else{var u=r&&("load"===r.type?"missing":r.type),a=r&&r.target&&r.target.href||c,i=new Error("Loading CSS chunk "+e+" failed.\n("+a+")");i.code="CSS_CHUNK_LOAD_FAILED",i.type=u,i.request=a,delete o[e],p.parentNode.removeChild(p),n(i)}},p.href=c,document.head.appendChild(p)})).then((function(){o[e]=0})));var n=c[e];if(0!==n)if(n)t.push(n[2]);else{var r=new Promise((function(t,r){n=c[e]=[t,r]}));t.push(n[2]=r);var u,i=document.createElement("script");i.charset="utf-8",i.timeout=120,a.nc&&i.setAttribute("nonce",a.nc),i.src=function(e){return a.p+"js/"+({}[e]||e)+".aa457b1a.js"}(e);var l=new Error;u=function(t){i.onerror=i.onload=null,clearTimeout(s);var n=c[e];if(0!==n){if(n){var r=t&&("load"===t.type?"missing":t.type),o=t&&t.target&&t.target.src;l.message="Loading chunk "+e+" failed.\n("+r+": "+o+")",l.name="ChunkLoadError",l.type=r,l.request=o,n[1](l)}c[e]=void 0}};var s=setTimeout((function(){u({type:"timeout",target:i})}),12e4);i.onerror=i.onload=u,document.head.appendChild(i)}return Promise.all(t)},a.m=e,a.c=r,a.d=function(e,t,n){a.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:n})},a.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},a.t=function(e,t){if(1&t&&(e=a(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var n=Object.create(null);if(a.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var r in e)a.d(n,r,function(t){return e[t]}.bind(null,r));return n},a.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return a.d(t,"a",t),t},a.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},a.p="/",a.oe=function(e){throw console.error(e),e};var i=window.webpackJsonp=window.webpackJsonp||[],l=i.push.bind(i);i.push=t,i=i.slice();for(var s=0;s<i.length;s++)t(i[s]);var f=l;u.push([288,1]),n()}({288:function(e,t,n){e.exports=n(524)},524:function(e,t,n){"use strict";n.r(t);var r=n(20),o=n.n(r),c=n(0),u=n.n(c),a=n(44),i=n.n(a),l=n(149),s=n(37),f=n(148),p=n.n(f),h=n(54),d=n.n(h),g=n(55),b=n.n(g),m=n(175),y=n.n(m),v=n(176),O=n.n(v),j=n(150),w=n.n(j),P=n(50),E=n.n(P);function S(e){var t=function(){if("undefined"==typeof Reflect||!Reflect.construct)return!1;if(Reflect.construct.sham)return!1;if("function"==typeof Proxy)return!0;try{return Boolean.prototype.valueOf.call(Reflect.construct(Boolean,[],(function(){}))),!0}catch(e){return!1}}();return function(){var n,r=w()(e);if(t){var o=w()(this).constructor;n=Reflect.construct(r,arguments,o)}else n=r.apply(this,arguments);return O()(this,n)}}function k(e){return function(t){y()(o,t);var n,r=S(o);function o(e){var t;return d()(this,o),(t=r.call(this,e)).state={component:null},t}return b()(o,[{key:"componentDidMount",value:(n=p()(E.a.mark((function t(){var n,r;return E.a.wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,e();case 2:n=t.sent,r=n.default,this.setState({component:r});case 5:case"end":return t.stop()}}),t,this)}))),function(){return n.apply(this,arguments)})},{key:"render",value:function(){var e=this.state.component;return e&&u.a.createElement(e,this.props)}}]),o}(c.Component)}var x=k((function(){return new Promise((function(e){n.e(3).then(function(t){e(n(531))}.bind(null,n)).catch(n.oe)}))})),_=k((function(){return new Promise((function(e){n.e(6).then(function(t){e(n(528))}.bind(null,n)).catch(n.oe)}))})),D=k((function(){return new Promise((function(e){n.e(5).then(function(t){e(n(529))}.bind(null,n)).catch(n.oe)}))})),C=k((function(){return new Promise((function(e){n.e(2).then(function(t){e(n(532))}.bind(null,n)).catch(n.oe)}))})),R=[{path:"/",exact:!0,render:function(){return u.a.createElement(s.Redirect,{to:"/login"})}},{component:k((function(){return new Promise((function(e){n.e(4).then(function(t){e(n(530))}.bind(null,n)).catch(n.oe)}))})),exact:!0,path:"/login"},{component:x,routes:[{component:C,path:"/work",exact:!0},{component:_,path:"/setting",exact:!0,routes:[{path:"/setting/about",component:D},{path:"/setting",render:function(){return u.a.createElement(s.Redirect,{to:"/setting/about"})}}]}]}],L=n(241),A=n(53);var B={},M=n(160),T=n(115),z=n(153),N=n(152);function q(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,r)}return n}function I(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?q(Object(n),!0).forEach((function(t){o()(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):q(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}var J={zh:{translation:I(I(I({},M.portal_cn),T.privilege_cn),z.message_cn)}},F=n(239),H=n(284),K=n(285),U=n(43);F.a.use(K.a).use(H.a).use(U.g).init({resources:J,fallbackLng:"zh",lng:"zh",debug:!1,interpolation:{escapeValue:!1}});F.a;function V(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,r)}return n}function G(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?V(Object(n),!0).forEach((function(t){o()(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):V(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}var Q=function(){var e=G(G(G(G({},B),M.stores),T.privilegeStores),z.messageModuleStores);return Object(N.useLoadLanguage)(J,"get","/plugin/getPluginConfig","zh"),u.a.createElement(A.Provider,e,u.a.createElement(l.BrowserRouter,null,Object(L.a)(Object(N.handelPluginRouter)(R,[]))))};i.a.render(u.a.createElement(Q,null),document.getElementById("root"))}});
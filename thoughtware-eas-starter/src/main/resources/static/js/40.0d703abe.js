(window.webpackJsonp=window.webpackJsonp||[]).push([[40],{793:function(e,t,r){"use strict";r.r(t),r.d(t,"default",(function(){return f}));r(528);var n=r(527),a=(r(100),r(35)),u=r(0),o=r.n(u),c=r(8),i=r(238),s=function(e){var t=e.history;Object(u.useEffect)((function(){Object(c.removeUser)()}),[]);return o.a.createElement("main",{className:"thoughtware_noproduct"},o.a.createElement(n.default,{status:"error",title:"授权失败",subTitle:"当前登录用户不在产品授权列中",extra:o.a.createElement(a.default,{type:"primary",onClick:function(){Object(i.a)().then((function(e){if(0===e.code)return e.data.authType?t.push("/login"):window.location.href=e.data.authServiceUrl}))}},"登录")}))};function l(){return(l=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var r=arguments[t];for(var n in r)Object.prototype.hasOwnProperty.call(r,n)&&(e[n]=r[n])}return e}).apply(this,arguments)}var f=function(e){return o.a.createElement(s,l({},e,{__source:{fileName:"/Users/gaomengyuan/thoughtware/thoughtware-eas-ui/src/login/ExcludeProductUser.js",lineNumber:11,columnNumber:12}}))}}}]);
(window.webpackJsonp=window.webpackJsonp||[]).push([[23],{591:function(e,t,r){"use strict";r.d(t,"a",(function(){return c})),r.d(t,"b",(function(){return d})),r.d(t,"c",(function(){return v}));var n,i=r(0),o=(n=function(e,t){return(n=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var r in t)t.hasOwnProperty(r)&&(e[r]=t[r])})(e,t)},function(e,t){function r(){this.constructor=e}n(e,t),e.prototype=null===t?Object.create(t):(r.prototype=t.prototype,new r)}),a=i.createContext(null),c=function(e){function t(){return null!==e&&e.apply(this,arguments)||this}return o(t,e),t.prototype.render=function(){return i.createElement(a.Provider,{value:this.props.store},this.props.children)},t}(i.Component),l=r(219),u=r.n(l),s=r(220),f=r.n(s),p=function(){var e=function(t,r){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var r in t)t.hasOwnProperty(r)&&(e[r]=t[r])})(t,r)};return function(t,r){function n(){this.constructor=t}e(t,r),t.prototype=null===r?Object.create(r):(n.prototype=r.prototype,new n)}}(),m=function(){return(m=Object.assign||function(e){for(var t,r=1,n=arguments.length;r<n;r++)for(var i in t=arguments[r])Object.prototype.hasOwnProperty.call(t,i)&&(e[i]=t[i]);return e}).apply(this,arguments)};var h=function(){return{}};function d(e,t){void 0===t&&(t={});var r=!!e,n=e||h;return function(o){var c=function(t){function c(e,r){var i=t.call(this,e,r)||this;return i.unsubscribe=null,i.handleChange=function(){if(i.unsubscribe){var e=n(i.store.getState(),i.props);i.setState({subscribed:e})}},i.store=i.context,i.state={subscribed:n(i.store.getState(),e),store:i.store,props:e},i}return p(c,t),c.getDerivedStateFromProps=function(t,r){return e&&2===e.length&&t!==r.props?{subscribed:n(r.store.getState(),t),props:t}:{props:t}},c.prototype.componentDidMount=function(){this.trySubscribe()},c.prototype.componentWillUnmount=function(){this.tryUnsubscribe()},c.prototype.shouldComponentUpdate=function(e,t){return!u()(this.props,e)||!u()(this.state.subscribed,t.subscribed)},c.prototype.trySubscribe=function(){r&&(this.unsubscribe=this.store.subscribe(this.handleChange),this.handleChange())},c.prototype.tryUnsubscribe=function(){this.unsubscribe&&(this.unsubscribe(),this.unsubscribe=null)},c.prototype.render=function(){var e=m(m(m({},this.props),this.state.subscribed),{store:this.store});return i.createElement(o,m({},e,{ref:this.props.miniStoreForwardedRef}))},c.displayName="Connect("+function(e){return e.displayName||e.name||"Component"}(o)+")",c.contextType=a,c}(i.Component);if(t.forwardRef){var l=i.forwardRef((function(e,t){return i.createElement(c,m({},e,{miniStoreForwardedRef:t}))}));return f()(l,o)}return f()(c,o)}}var y=function(){return(y=Object.assign||function(e){for(var t,r=1,n=arguments.length;r<n;r++)for(var i in t=arguments[r])Object.prototype.hasOwnProperty.call(t,i)&&(e[i]=t[i]);return e}).apply(this,arguments)};function v(e){var t=e,r=[];return{setState:function(e){t=y(y({},t),e);for(var n=0;n<r.length;n++)r[n]()},getState:function(){return t},subscribe:function(e){return r.push(e),function(){var t=r.indexOf(e);r.splice(t,1)}}}}},646:function(e,t,r){"use strict";var n,i,o,a=r(17),c=r(10);function l(e){return(l="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e})(e)}function u(){/*! regenerator-runtime -- Copyright (c) 2014-present, Facebook, Inc. -- license (MIT): https://github.com/facebook/regenerator/blob/main/LICENSE */u=function(){return t};var e,t={},r=Object.prototype,n=r.hasOwnProperty,i=Object.defineProperty||function(e,t,r){e[t]=r.value},o="function"==typeof Symbol?Symbol:{},a=o.iterator||"@@iterator",c=o.asyncIterator||"@@asyncIterator",s=o.toStringTag||"@@toStringTag";function f(e,t,r){return Object.defineProperty(e,t,{value:r,enumerable:!0,configurable:!0,writable:!0}),e[t]}try{f({},"")}catch(e){f=function(e,t,r){return e[t]=r}}function p(e,t,r,n){var o=t&&t.prototype instanceof b?t:b,a=Object.create(o.prototype),c=new A(n||[]);return i(a,"_invoke",{value:_(e,r,c)}),a}function m(e,t,r){try{return{type:"normal",arg:e.call(t,r)}}catch(e){return{type:"throw",arg:e}}}t.wrap=p;var h="suspendedStart",d="executing",y="completed",v={};function b(){}function g(){}function w(){}var E={};f(E,a,(function(){return this}));var x=Object.getPrototypeOf,O=x&&x(x(T([])));O&&O!==r&&n.call(O,a)&&(E=O);var j=w.prototype=b.prototype=Object.create(E);function N(e){["next","throw","return"].forEach((function(t){f(e,t,(function(e){return this._invoke(t,e)}))}))}function S(e,t){function r(i,o,a,c){var u=m(e[i],e,o);if("throw"!==u.type){var s=u.arg,f=s.value;return f&&"object"==l(f)&&n.call(f,"__await")?t.resolve(f.__await).then((function(e){r("next",e,a,c)}),(function(e){r("throw",e,a,c)})):t.resolve(f).then((function(e){s.value=e,a(s)}),(function(e){return r("throw",e,a,c)}))}c(u.arg)}var o;i(this,"_invoke",{value:function(e,n){function i(){return new t((function(t,i){r(e,n,t,i)}))}return o=o?o.then(i,i):i()}})}function _(t,r,n){var i=h;return function(o,a){if(i===d)throw new Error("Generator is already running");if(i===y){if("throw"===o)throw a;return{value:e,done:!0}}for(n.method=o,n.arg=a;;){var c=n.delegate;if(c){var l=L(c,n);if(l){if(l===v)continue;return l}}if("next"===n.method)n.sent=n._sent=n.arg;else if("throw"===n.method){if(i===h)throw i=y,n.arg;n.dispatchException(n.arg)}else"return"===n.method&&n.abrupt("return",n.arg);i=d;var u=m(t,r,n);if("normal"===u.type){if(i=n.done?y:"suspendedYield",u.arg===v)continue;return{value:u.arg,done:n.done}}"throw"===u.type&&(i=y,n.method="throw",n.arg=u.arg)}}}function L(t,r){var n=r.method,i=t.iterator[n];if(i===e)return r.delegate=null,"throw"===n&&t.iterator.return&&(r.method="return",r.arg=e,L(t,r),"throw"===r.method)||"return"!==n&&(r.method="throw",r.arg=new TypeError("The iterator does not provide a '"+n+"' method")),v;var o=m(i,t.iterator,r.arg);if("throw"===o.type)return r.method="throw",r.arg=o.arg,r.delegate=null,v;var a=o.arg;return a?a.done?(r[t.resultName]=a.value,r.next=t.nextLoc,"return"!==r.method&&(r.method="next",r.arg=e),r.delegate=null,v):a:(r.method="throw",r.arg=new TypeError("iterator result is not an object"),r.delegate=null,v)}function k(e){var t={tryLoc:e[0]};1 in e&&(t.catchLoc=e[1]),2 in e&&(t.finallyLoc=e[2],t.afterLoc=e[3]),this.tryEntries.push(t)}function P(e){var t=e.completion||{};t.type="normal",delete t.arg,e.completion=t}function A(e){this.tryEntries=[{tryLoc:"root"}],e.forEach(k,this),this.reset(!0)}function T(t){if(t||""===t){var r=t[a];if(r)return r.call(t);if("function"==typeof t.next)return t;if(!isNaN(t.length)){var i=-1,o=function r(){for(;++i<t.length;)if(n.call(t,i))return r.value=t[i],r.done=!1,r;return r.value=e,r.done=!0,r};return o.next=o}}throw new TypeError(l(t)+" is not iterable")}return g.prototype=w,i(j,"constructor",{value:w,configurable:!0}),i(w,"constructor",{value:g,configurable:!0}),g.displayName=f(w,s,"GeneratorFunction"),t.isGeneratorFunction=function(e){var t="function"==typeof e&&e.constructor;return!!t&&(t===g||"GeneratorFunction"===(t.displayName||t.name))},t.mark=function(e){return Object.setPrototypeOf?Object.setPrototypeOf(e,w):(e.__proto__=w,f(e,s,"GeneratorFunction")),e.prototype=Object.create(j),e},t.awrap=function(e){return{__await:e}},N(S.prototype),f(S.prototype,c,(function(){return this})),t.AsyncIterator=S,t.async=function(e,r,n,i,o){void 0===o&&(o=Promise);var a=new S(p(e,r,n,i),o);return t.isGeneratorFunction(r)?a:a.next().then((function(e){return e.done?e.value:a.next()}))},N(j),f(j,s,"Generator"),f(j,a,(function(){return this})),f(j,"toString",(function(){return"[object Generator]"})),t.keys=function(e){var t=Object(e),r=[];for(var n in t)r.push(n);return r.reverse(),function e(){for(;r.length;){var n=r.pop();if(n in t)return e.value=n,e.done=!1,e}return e.done=!0,e}},t.values=T,A.prototype={constructor:A,reset:function(t){if(this.prev=0,this.next=0,this.sent=this._sent=e,this.done=!1,this.delegate=null,this.method="next",this.arg=e,this.tryEntries.forEach(P),!t)for(var r in this)"t"===r.charAt(0)&&n.call(this,r)&&!isNaN(+r.slice(1))&&(this[r]=e)},stop:function(){this.done=!0;var e=this.tryEntries[0].completion;if("throw"===e.type)throw e.arg;return this.rval},dispatchException:function(t){if(this.done)throw t;var r=this;function i(n,i){return c.type="throw",c.arg=t,r.next=n,i&&(r.method="next",r.arg=e),!!i}for(var o=this.tryEntries.length-1;o>=0;--o){var a=this.tryEntries[o],c=a.completion;if("root"===a.tryLoc)return i("end");if(a.tryLoc<=this.prev){var l=n.call(a,"catchLoc"),u=n.call(a,"finallyLoc");if(l&&u){if(this.prev<a.catchLoc)return i(a.catchLoc,!0);if(this.prev<a.finallyLoc)return i(a.finallyLoc)}else if(l){if(this.prev<a.catchLoc)return i(a.catchLoc,!0)}else{if(!u)throw new Error("try statement without catch or finally");if(this.prev<a.finallyLoc)return i(a.finallyLoc)}}}},abrupt:function(e,t){for(var r=this.tryEntries.length-1;r>=0;--r){var i=this.tryEntries[r];if(i.tryLoc<=this.prev&&n.call(i,"finallyLoc")&&this.prev<i.finallyLoc){var o=i;break}}o&&("break"===e||"continue"===e)&&o.tryLoc<=t&&t<=o.finallyLoc&&(o=null);var a=o?o.completion:{};return a.type=e,a.arg=t,o?(this.method="next",this.next=o.finallyLoc,v):this.complete(a)},complete:function(e,t){if("throw"===e.type)throw e.arg;return"break"===e.type||"continue"===e.type?this.next=e.arg:"return"===e.type?(this.rval=this.arg=e.arg,this.method="return",this.next="end"):"normal"===e.type&&t&&(this.next=t),v},finish:function(e){for(var t=this.tryEntries.length-1;t>=0;--t){var r=this.tryEntries[t];if(r.finallyLoc===e)return this.complete(r.completion,r.afterLoc),P(r),v}},catch:function(e){for(var t=this.tryEntries.length-1;t>=0;--t){var r=this.tryEntries[t];if(r.tryLoc===e){var n=r.completion;if("throw"===n.type){var i=n.arg;P(r)}return i}}throw new Error("illegal catch attempt")},delegateYield:function(t,r,n){return this.delegate={iterator:T(t),resultName:r,nextLoc:n},"next"===this.method&&(this.arg=e),v}},t}function s(e,t,r,n,i,o,a){try{var c=e[o](a),l=c.value}catch(e){return void r(e)}c.done?t(l):Promise.resolve(l).then(n,i)}function f(e){return function(){var t=this,r=arguments;return new Promise((function(n,i){var o=e.apply(t,r);function a(e){s(o,n,i,a,c,"next",e)}function c(e){s(o,n,i,a,c,"throw",e)}a(void 0)}))}}function p(e,t,r,n){r&&Object.defineProperty(e,t,{enumerable:r.enumerable,configurable:r.configurable,writable:r.writable,value:r.initializer?r.initializer.call(n):void 0})}function m(e,t){for(var r=0;r<t.length;r++){var n=t[r];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,d(n.key),n)}}function h(e,t,r){return t&&m(e.prototype,t),r&&m(e,r),Object.defineProperty(e,"prototype",{writable:!1}),e}function d(e){var t=function(e,t){if("object"!==l(e)||null===e)return e;var r=e[Symbol.toPrimitive];if(void 0!==r){var n=r.call(e,t||"default");if("object"!==l(n))return n;throw new TypeError("@@toPrimitive must return a primitive value.")}return("string"===t?String:Number)(e)}(e,"string");return"symbol"===l(t)?t:String(t)}function y(e,t,r,n,i){var o={};return Object.keys(n).forEach((function(e){o[e]=n[e]})),o.enumerable=!!o.enumerable,o.configurable=!!o.configurable,("value"in o||o.initializer)&&(o.writable=!0),o=r.slice().reverse().reduce((function(r,n){return n(e,t,r)||r}),o),i&&void 0!==o.initializer&&(o.value=o.initializer?o.initializer.call(i):void 0,o.initializer=void 0),void 0===o.initializer&&(Object.defineProperty(e,t,o),o=null),o}var v=(i=y((n=h((function e(){var t,r,n;!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,e),p(this,"getVersions",i,this),p(this,"findUseLicence",o,this),t=this,r="findAllLicence",n=f(u().mark((function e(){return u().wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,c.Axios.post("/licence/findAllLicence");case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}}),e)}))),(r=d(r))in t?Object.defineProperty(t,r,{value:n,enumerable:!0,configurable:!0,writable:!0}):t[r]=n}))).prototype,"getVersions",[a.action],{configurable:!0,enumerable:!0,writable:!0,initializer:function(){return f(u().mark((function e(){return u().wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,c.Axios.post("/version/getVersion");case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}}),e)})))}}),o=y(n.prototype,"findUseLicence",[a.action],{configurable:!0,enumerable:!0,writable:!0,initializer:function(){return f(u().mark((function e(){return u().wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.next=2,c.Axios.post("/licence/findUseLicence");case 2:return e.abrupt("return",e.sent);case 3:case"end":return e.stop()}}),e)})))}}),n);t.a=new v},650:function(e,t,r){"use strict";r(119);var n=r(53),i=r(0),o=r.n(i),a=r(525);t.a=function(e){var t=e.firstItem,r=e.secondItem,i=e.onClick,c=e.children;return o.a.createElement("div",{className:"licence-breadcrumb"},o.a.createElement(n.default,null,o.a.createElement("span",{className:i?"licence-breadcrumb-first":"",onClick:i},i&&o.a.createElement(a.default,{style:{marginRight:8}}),o.a.createElement("span",{className:r?"licence-breadcrumb-span":""},t)),r&&o.a.createElement("span",null," /   ",r)),o.a.createElement("div",null,c))}},688:function(e,t,r){},793:function(e,t,r){"use strict";r(688)},811:function(e,t,r){"use strict";r(224);var n=r(137),i=(r(515),r(517)),o=(r(516),r(518)),a=(r(520),r(519)),c=(r(539),r(538)),l=(r(326),r(225)),u=(r(218),r(62)),s=r(0),f=r.n(s),p=r(10),m=r(514),h=r(650),d=r(116),y=r(353),v=r(265),b=r(266),g=r(606),w=r.n(g),E=r(646);r(688);function x(){return(x=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var r=arguments[t];for(var n in r)Object.prototype.hasOwnProperty.call(r,n)&&(e[n]=r[n])}return e}).apply(this,arguments)}function O(e){return function(e){if(Array.isArray(e))return S(e)}(e)||function(e){if("undefined"!=typeof Symbol&&null!=e[Symbol.iterator]||null!=e["@@iterator"])return Array.from(e)}(e)||N(e)||function(){throw new TypeError("Invalid attempt to spread non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function j(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var r=null==e?null:"undefined"!=typeof Symbol&&e[Symbol.iterator]||e["@@iterator"];if(null!=r){var n,i,o,a,c=[],l=!0,u=!1;try{if(o=(r=r.call(e)).next,0===t){if(Object(r)!==r)return;l=!1}else for(;!(l=(n=o.call(r)).done)&&(c.push(n.value),c.length!==t);l=!0);}catch(e){u=!0,i=e}finally{try{if(!l&&null!=r.return&&(a=r.return(),Object(a)!==a))return}finally{if(u)throw i}}return c}}(e,t)||N(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function N(e,t){if(e){if("string"==typeof e)return S(e,t);var r=Object.prototype.toString.call(e).slice(8,-1);return"Object"===r&&e.constructor&&(r=e.constructor.name),"Map"===r||"Set"===r?Array.from(e):"Arguments"===r||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(r)?S(e,t):void 0}}function S(e,t){(null==t||t>e.length)&&(t=e.length);for(var r=0,n=new Array(t);r<t;r++)n[r]=e[r];return n}var _=function(e){var t=e.bgroup,r=e.children,g=E.a.getVersions,N=E.a.findUseLicence,S=E.a.findAllLicence,_=j(Object(s.useState)(null),2),L=_[0],k=_[1],P=j(Object(s.useState)(null),2),A=P[0],T=P[1],C=j(Object(s.useState)([]),2),Y=C[0],I=C[1],F=j(Object(s.useState)({}),2),M=F[0],z=F[1],D=j(Object(s.useState)(!1),2),G=D[0],U=D[1],H=j(Object(s.useState)(!1),2),R=H[0],V=H[1],J=j(Object(s.useState)(!0),2),K=J[0],W=J[1],$=window.location.origin;Object(s.useEffect)((function(){q()}),[]);var q=function(){g().then((function(e){0===e.code&&(z(e.data),localStorage.setItem(p.LOCALSTORAGE_KEY.VERSION_INFO,JSON.stringify(e.data)),e.data.expired||(B(),Q())),W(!1)}))},B=function(){N().then((function(e){0===e.code&&e.data&&T(e.data),6e3===e.code&&u.default.error(e.msg)}))},Q=function(){S().then((function(e){0===e.code&&k(e.data)}))},X={name:"file",action:$+("/"===$.substring($.length-1,$.length)?"licence/import":"/licence/import"),onChange:function(e){var t=O(e.fileList);if(t=(t=t.slice(-1)).map((function(e){return e.response&&(e.url=e.response.url),e})),I(t),"uploading"!==e.file.status&&console.log(e.file,e.fileList),"done"===e.file.status){var r=e.file;return 0===r.response.code?(setTimeout((function(){I([]),q()}),1e3),u.default.success("licence导入成功")):u.default.error("licence导入失败：".concat(r.response.msg))}if("error"===e.file.status)return u.default.error("licence导入失败，请重新上传")}},Z=[{title:"生效时间",dataIndex:"expiryTime",key:"expiryTime",width:"32%",ellipsis:!0,render:function(e){return w()(e).format("YYYY-MM-DD HH:mm:ss")}},{title:"过期时间",dataIndex:"issuedTime",key:"issuedTime",width:"30%",ellipsis:!0,render:function(e){return w()(e).format("YYYY-MM-DD HH:mm:ss")}},{title:"用户数",dataIndex:"userNum",key:"userNum",width:"32%",ellipsis:!0,render:function(e){return e>0?e:"无限制"}},{title:"状态",dataIndex:"state",key:"state",width:"16%",ellipsis:!0,render:function(e){return f.a.createElement(f.a.Fragment,null,1===e&&"已失效",2===e&&f.a.createElement("span",{className:"licence-history-modal-blue"},"生效中"),3===e&&"未生效")}}];return f.a.createElement(n.default,{spinning:K,tip:"导入licence中..."},f.a.createElement(i.default,{className:"tiklab_version"},f.a.createElement(o.default,{sm:{span:24},xs:{span:24},md:{span:24},lg:{span:"16",offset:"4"},xl:{span:"14",offset:"5"},xxl:{span:"14",offset:"5"}},f.a.createElement("div",{className:"tiklab_version_container"},f.a.createElement(h.a,{firstItem:"版本与许可证"},f.a.createElement("div",{className:"tiklab_version_up_btn"},2===(null==M?void 0:M.release)&&f.a.createElement(f.a.Fragment,null,f.a.createElement(c.a,x({},X,{fileList:Y}),f.a.createElement(d.a,{isMar:!M.expired,type:"primary"},"导入licence")),!M.expired&&f.a.createElement(f.a.Fragment,null,f.a.createElement(d.a,{onClick:function(){return V(!0)}},"历史"),f.a.createElement(y.a,{title:f.a.createElement("div",{className:"licence-history-modal-title"},f.a.createElement("div",null,"历史"),f.a.createElement(d.a,{type:"text",onClick:function(){return V(!1)},title:f.a.createElement(m.a,null)})),width:800,visible:R,onCancel:function(){return V(!1)},footer:null},f.a.createElement("div",{className:"licence-history-modal"},f.a.createElement(a.default,{dataSource:L,columns:Z,pagination:!1,rowKey:function(e,t){return t},locale:{emptyText:f.a.createElement("div",{className:"licence-history-modal-empty"},"暂无历史")}}))))))),f.a.createElement("div",{className:"tiklab_version-info"},f.a.createElement("div",{className:"tiklab_version-info-item"},f.a.createElement("span",{className:"info-item-title"},"应用名称"),p.productTitle[t]),f.a.createElement("div",{className:"tiklab_version-info-item"},f.a.createElement("div",{className:"info-item-title"},"版本类型"),M.expired?f.a.createElement(f.a.Fragment,null,f.a.createElement("div",{className:"info-item-img"},f.a.createElement("img",{src:v.a,alt:"企业版特性",height:16,width:16})),f.a.createElement("div",{className:"info-item-info"},"社区版"),f.a.createElement("div",null,f.a.createElement("span",{className:"info-item-action",onClick:function(){return U(!0)}},"企业版特性"),f.a.createElement("span",{className:"info-item-action",onClick:function(){Object(p.applySubscription)(t)}},"订阅")),f.a.createElement(y.a,{width:800,visible:G,onCancel:function(){return U(!1)},footer:null,title:f.a.createElement("div",{className:"licence-version-feat-modal-title"},f.a.createElement("div",null,"企业版特性"),f.a.createElement(d.a,{type:"text",onClick:function(){return U(!1)},title:f.a.createElement(m.a,null)}))},f.a.createElement("div",{className:"licence-version-feat-modal"},r))):f.a.createElement(f.a.Fragment,null,f.a.createElement("div",{className:"info-item-img"},f.a.createElement("img",{src:b.a,alt:"企业版特性",height:16,width:16})),f.a.createElement("div",null,"企业版"),f.a.createElement("div",{className:"info-item-action"},M.expired?null!=A&&A.tryApply?f.a.createElement(l.default,{color:"#ff4d4f"},"试用已过期"):f.a.createElement(l.default,{color:"#ff4d4f"},"订阅已过期"):null!=A&&A.tryApply?f.a.createElement(l.default,{color:"#5d70ea"},"试用中"):f.a.createElement(l.default,{color:"#5d70ea"},"订阅中")))),f.a.createElement("div",{className:"tiklab_version-info-item"},f.a.createElement("span",{className:"info-item-title"},"用户数"),1===M.release||M.expired?"不限制":(null==A?void 0:A.userNum)>0?A.userNum+"人":"不限制"),f.a.createElement("div",{className:"tiklab_version-info-item"},f.a.createElement("span",{className:"info-item-title"},"生效时间"),null!=A&&A.expiryTime?w()(null==A?void 0:A.expiryTime).format("YYYY-MM-DD HH:mm:ss"):"--"),f.a.createElement("div",{className:"tiklab_version-info-item"},f.a.createElement("span",{className:"info-item-title"},"过期时间"),null!=A&&A.issuedTime?w()(null==A?void 0:A.issuedTime).format("YYYY-MM-DD HH:mm:ss"):"--"))))))};t.a=_}}]);
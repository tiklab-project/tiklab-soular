(window.webpackJsonp=window.webpackJsonp||[]).push([[30],{565:function(t,n,r){"use strict";r.d(n,"a",(function(){return u})),r.d(n,"b",(function(){return y})),r.d(n,"c",(function(){return v}));var e,o=r(0),i=(e=function(t,n){return(e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var r in n)n.hasOwnProperty(r)&&(t[r]=n[r])})(t,n)},function(t,n){function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}),s=o.createContext(null),u=function(t){function n(){return null!==t&&t.apply(this,arguments)||this}return i(n,t),n.prototype.render=function(){return o.createElement(s.Provider,{value:this.props.store},this.props.children)},n}(o.Component),c=r(222),a=r.n(c),p=r(224),f=r.n(p),b=function(){var t=function(n,r){return(t=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,n){t.__proto__=n}||function(t,n){for(var r in n)n.hasOwnProperty(r)&&(t[r]=n[r])})(n,r)};return function(n,r){function e(){this.constructor=n}t(n,r),n.prototype=null===r?Object.create(r):(e.prototype=r.prototype,new e)}}(),l=function(){return(l=Object.assign||function(t){for(var n,r=1,e=arguments.length;r<e;r++)for(var o in n=arguments[r])Object.prototype.hasOwnProperty.call(n,o)&&(t[o]=n[o]);return t}).apply(this,arguments)};var h=function(){return{}};function y(t,n){void 0===n&&(n={});var r=!!t,e=t||h;return function(i){var u=function(n){function u(t,r){var o=n.call(this,t,r)||this;return o.unsubscribe=null,o.handleChange=function(){if(o.unsubscribe){var t=e(o.store.getState(),o.props);o.setState({subscribed:t})}},o.store=o.context,o.state={subscribed:e(o.store.getState(),t),store:o.store,props:t},o}return b(u,n),u.getDerivedStateFromProps=function(n,r){return t&&2===t.length&&n!==r.props?{subscribed:e(r.store.getState(),n),props:n}:{props:n}},u.prototype.componentDidMount=function(){this.trySubscribe()},u.prototype.componentWillUnmount=function(){this.tryUnsubscribe()},u.prototype.shouldComponentUpdate=function(t,n){return!a()(this.props,t)||!a()(this.state.subscribed,n.subscribed)},u.prototype.trySubscribe=function(){r&&(this.unsubscribe=this.store.subscribe(this.handleChange),this.handleChange())},u.prototype.tryUnsubscribe=function(){this.unsubscribe&&(this.unsubscribe(),this.unsubscribe=null)},u.prototype.render=function(){var t=l(l(l({},this.props),this.state.subscribed),{store:this.store});return o.createElement(i,l({},t,{ref:this.props.miniStoreForwardedRef}))},u.displayName="Connect("+function(t){return t.displayName||t.name||"Component"}(i)+")",u.contextType=s,u}(o.Component);if(n.forwardRef){var c=o.forwardRef((function(t,n){return o.createElement(u,l({},t,{miniStoreForwardedRef:n}))}));return f()(c,i)}return f()(u,i)}}var d=function(){return(d=Object.assign||function(t){for(var n,r=1,e=arguments.length;r<e;r++)for(var o in n=arguments[r])Object.prototype.hasOwnProperty.call(n,o)&&(t[o]=n[o]);return t}).apply(this,arguments)};function v(t){var n=t,r=[];return{setState:function(t){n=d(d({},n),t);for(var e=0;e<r.length;e++)r[e]()},getState:function(){return n},subscribe:function(t){return r.push(t),function(){var n=r.indexOf(t);r.splice(n,1)}}}}},983:function(t,n,r){"use strict";r.r(n),r.d(n,"default",(function(){return u}));r(942);var e=r(948),o=r(0),i=r.n(o);function s(){return(s=Object.assign?Object.assign.bind():function(t){for(var n=1;n<arguments.length;n++){var r=arguments[n];for(var e in r)Object.prototype.hasOwnProperty.call(r,e)&&(t[e]=r[e])}return t}).apply(this,arguments)}var u=function(t){return i.a.createElement(e.a,s({},t,{__source:{fileName:"/Users/gaomengyuan/tiklab/tiklab-eas-ui/src/setting/Base/Message/MessageType.js",lineNumber:14,columnNumber:9}}))}}}]);
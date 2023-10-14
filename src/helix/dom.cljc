(ns helix.dom
  (:refer-clojure :exclude [map meta time])
  (:require
   [cljs.tagged-literals :as tl]
   [helix.core :as hx]
   [helix.impl.props :as impl.props])
  #?(:cljs (:require-macros [helix.dom])))

;; (declare
;;  input textarea option select a abbr address area article aside audio b base bdi
;;  bdo big blockquote body br button canvas caption cite code col colgroup data datalist
;;  dd del details dfn dialog div dl dt em embed fieldset figcaption figure footer form
;;  h1 h2 h3 h4 h5 h6 head header hgroup hr html i iframe img ins kbd keygen label legend
;;  li link main map mark menu menuitem meta meter nav noscript object ol optgroup output
;;  p param picture pre progress q rp rt ruby s samp script section small source span
;;  strong style sub summary sup table tbody td tfoot th thead time title tr track u ul var
;;  video wbr circle clipPath ellipse g line mask path pattern polyline rect svg text defs
;;  linearGradient polygon radialGradient stop tspan)

#_(def tags
  '[input textarea option select

    a
    abbr
    address
    area
    article
    aside
    audio
    b
    base
    bdi
    bdo
    big
    blockquote
    body
    br
    button
    canvas
    caption
    cite
    code
    col
    colgroup
    data
    datalist
    dd
    del
    details
    dfn
    dialog
    div
    dl
    dt
    em
    embed
    fieldset
    figcaption
    figure
    footer
    form
    h1
    h2
    h3
    h4
    h5
    h6
    head
    header
    hgroup
    hr
    html
    i
    iframe
    img
    ins
    kbd
    keygen
    label
    legend
    li
    link
    main
    map
    mark
    menu
    menuitem
    meta
    meter
    nav
    noscript
    object
    ol
    optgroup
    output
    p
    param
    picture
    pre
    progress
    q
    rp
    rt
    ruby
    s
    samp
    script
    section
    small
    source
    span
    strong
    style
    sub
    summary
    sup
    table
    tbody
    td
    tfoot
    th
    thead
    time
    title
    tr
    track
    u
    ul
    var
    video
    wbr

    ;; svg
    circle
    clipPath
    ellipse
    g
    line
    marker
    mask
    path
    pattern
    polyline
    rect
    svg
    text
    defs
    linearGradient
    polygon
    radialGradient
    stop
    tspan])


(defmacro $d
  "Creates a new React DOM element. \"type\" ought to be a string like \"span\",
  \"div\",etc.

  When a map of props are passed as the second argument, will statically convert
  to a JS object, specially handling things like converting kebab-case props to
  camelCase and other transformations.

  Use the special & or :& prop to merge dynamic props in."
  [type & args]
  (let [?p (first args)
        has-props? (map? ?p)
        children* (if has-props?
                    (rest args)
                    args)
        multiple-children (next children*)
        children (if multiple-children
                   (tl/->JSValue children*)
                   (first children*))
        props* (when has-props? ?p)
        key (:key props*)
        emit-fn (if multiple-children
                  `hx/jsxs
                  `hx/jsx)]
    (if (some? key)
      `^js/React.Element (~emit-fn ~type (impl.props/dom-props ~props* ~children) ~key)
      `^js/React.Element (~emit-fn ~type (impl.props/dom-props ~props* ~children)))))

;; #?(:clj (defn gen-tag
;;           [tag]
;;           `(defmacro ~tag [& args]
;;              {:style/indent 0}
;;              `($d ~(str '~tag) ~@args))))

;; #?(:clj (defmacro gen-tags
;;           []
;;           `(do
;;              ~@(for [tag tags]
;;                  (gen-tag tag)))))

;; #?(:clj (gen-tags))


;;
;; Autogenerated code below
;;

(defmacro input [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'input)) args)))

(defmacro textarea [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'textarea)) args)))

(defmacro option [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'option)) args)))

(defmacro select [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'select)) args)))

(defmacro a [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'a)) args)))

(defmacro abbr [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'abbr)) args)))

(defmacro address [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'address)) args)))

(defmacro area [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'area)) args)))

(defmacro article [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'article)) args)))

(defmacro aside [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'aside)) args)))

(defmacro audio [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'audio)) args)))

(defmacro b [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'b)) args)))

(defmacro base [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'base)) args)))

(defmacro bdi [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'bdi)) args)))

(defmacro bdo [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'bdo)) args)))

(defmacro big [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'big)) args)))

(defmacro blockquote [& args]
  #:style{:indent 0}
  (seq
   (concat
    (list `$d)
    (list (str 'blockquote))
    args)))

(defmacro body [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'body)) args)))

(defmacro br [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'br)) args)))

(defmacro button [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'button)) args)))

(defmacro canvas [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'canvas)) args)))

(defmacro caption [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'caption)) args)))

(defmacro cite [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'cite)) args)))

(defmacro code [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'code)) args)))

(defmacro col [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'col)) args)))

(defmacro colgroup [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'colgroup)) args)))

(defmacro data [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'data)) args)))

(defmacro datalist [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'datalist)) args)))

(defmacro dd [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'dd)) args)))

(defmacro del [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'del)) args)))

(defmacro details [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'details)) args)))

(defmacro dfn [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'dfn)) args)))

(defmacro dialog [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'dialog)) args)))

(defmacro div [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'div)) args)))

(defmacro dl [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'dl)) args)))

(defmacro dt [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'dt)) args)))

(defmacro em [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'em)) args)))

(defmacro embed [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'embed)) args)))

(defmacro fieldset [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'fieldset)) args)))

(defmacro figcaption [& args]
  #:style{:indent 0}
  (seq
   (concat
    (list `$d)
    (list (str 'figcaption))
    args)))

(defmacro figure [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'figure)) args)))

(defmacro footer [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'footer)) args)))

(defmacro form [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'form)) args)))

(defmacro h1 [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'h1)) args)))

(defmacro h2 [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'h2)) args)))

(defmacro h3 [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'h3)) args)))

(defmacro h4 [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'h4)) args)))

(defmacro h5 [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'h5)) args)))

(defmacro h6 [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'h6)) args)))

(defmacro head [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'head)) args)))

(defmacro header [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'header)) args)))

(defmacro hgroup [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'hgroup)) args)))

(defmacro hr [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'hr)) args)))

(defmacro html [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'html)) args)))

(defmacro i [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'i)) args)))

(defmacro iframe [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'iframe)) args)))

(defmacro img [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'img)) args)))

(defmacro ins [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'ins)) args)))

(defmacro kbd [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'kbd)) args)))

(defmacro keygen [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'keygen)) args)))

(defmacro label [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'label)) args)))

(defmacro legend [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'legend)) args)))

(defmacro li [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'li)) args)))

(defmacro link [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'link)) args)))

(defmacro main [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'main)) args)))

(defmacro map [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'map)) args)))

(defmacro mark [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'mark)) args)))

(defmacro menu [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'menu)) args)))

(defmacro menuitem [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'menuitem)) args)))

(defmacro meta [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'meta)) args)))

(defmacro meter [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'meter)) args)))

(defmacro nav [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'nav)) args)))

(defmacro noscript [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'noscript)) args)))

(defmacro object [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'object)) args)))

(defmacro ol [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'ol)) args)))

(defmacro optgroup [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'optgroup)) args)))

(defmacro output [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'output)) args)))

(defmacro p [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'p)) args)))

(defmacro param [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'param)) args)))

(defmacro picture [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'picture)) args)))

(defmacro pre [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'pre)) args)))

(defmacro progress [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'progress)) args)))

(defmacro q [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'q)) args)))

(defmacro rp [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'rp)) args)))

(defmacro rt [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'rt)) args)))

(defmacro ruby [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'ruby)) args)))

(defmacro s [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 's)) args)))

(defmacro samp [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'samp)) args)))

(defmacro script [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'script)) args)))

(defmacro section [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'section)) args)))

(defmacro small [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'small)) args)))

(defmacro source [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'source)) args)))

(defmacro span [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'span)) args)))

(defmacro strong [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'strong)) args)))

(defmacro style [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'style)) args)))

(defmacro sub [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'sub)) args)))

(defmacro summary [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'summary)) args)))

(defmacro sup [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'sup)) args)))

(defmacro table [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'table)) args)))

(defmacro tbody [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'tbody)) args)))

(defmacro td [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'td)) args)))

(defmacro tfoot [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'tfoot)) args)))

(defmacro th [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'th)) args)))

(defmacro thead [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'thead)) args)))

(defmacro time [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'time)) args)))

(defmacro title [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'title)) args)))

(defmacro tr [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'tr)) args)))

(defmacro track [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'track)) args)))

(defmacro u [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'u)) args)))

(defmacro ul [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'ul)) args)))

(defmacro var [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'var)) args)))

(defmacro video [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'video)) args)))

(defmacro wbr [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'wbr)) args)))

(defmacro circle [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'circle)) args)))

(defmacro clipPath [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'clipPath)) args)))

(defmacro ellipse [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'ellipse)) args)))

(defmacro g [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'g)) args)))

(defmacro line [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'line)) args)))

(defmacro marker [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'marker)) args)))

(defmacro mask [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'mask)) args)))

(defmacro path [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'path)) args)))

(defmacro pattern [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'pattern)) args)))

(defmacro polyline [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'polyline)) args)))

(defmacro rect [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'rect)) args)))

(defmacro svg [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'svg)) args)))

(defmacro text [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'text)) args)))

(defmacro defs [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'defs)) args)))

(defmacro linearGradient [& args]
  #:style{:indent 0}
  (seq
   (concat
    (list `$d)
    (list (str 'linearGradient))
    args)))

(defmacro polygon [& args]
  #:style{:indent 0}
  (seq
   (concat (list `$d) (list (str 'polygon)) args)))

(defmacro radialGradient [& args]
  #:style{:indent 0}
  (seq
   (concat
    (list `$d)
    (list (str 'radialGradient))
    args)))

(defmacro stop [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'stop)) args)))

(defmacro tspan [& args]
  #:style{:indent 0}
  (seq (concat (list `$d) (list (str 'tspan)) args)))

package acme

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/acme/index")
        "/index"(view:"/acme/index")
        "/ui-sliders-progress"(view:"/acme/ui-sliders-progress")
        "/ui-nestable-list"(view:"/acme/ui-nestable-list")
        "/ui-elements"(view:"/acme/ui-elements")
        "/widgets"(view:"/acme/widgets")
        "/page-infrastructure"(view:"/acme/page-infrastructure")
        "/page-inbox"(view:"/acme/page-inbox")
        "/page-todo"(view:"/acme/page-todo")
        "/form-elements"(view:"/acme/form-elements")
        "/form-wizard"(view:"/acme/form-wizard")
        "/form-dropzone"(view:"/acme/form-dropzone")
        "/charts-flot"(view:"/acme/charts-flot")
        "/charts-xcharts"(view:"/acme/charts-xcharts")
        "/charts-others"(view:"/acme/charts-others")
        "/typography"(view:"/acme/typography")
        "/gallery"(view:"/acme/gallery")
        "/table"(view:"/acme/table")
        "/calendar"(view:"/acme/calendar")
        "/file-manager"(view:"/acme/file-manager")
        "/icons-halflings"(view:"/acme/icons-halflings")
        "/icons-glyphicons-pro"(view:"/acme/icons-glyphicons-pro")
        "/icons-filetypes"(view:"/acme/icons-filetypes")
        "/icons-social"(view:"/acme/icons-social")
        "/icons-font-awesome"(view:"/acme/icons-font-awesome")
        "/login"(view:"/acme/login")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

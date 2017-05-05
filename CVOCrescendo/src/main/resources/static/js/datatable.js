$(document).ready( function () {
    var table = $('#studentsTable').DataTable({
        "sAjaxSource": "/courses",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "name" },
            { "mData": "type" },
        ]
    })
});
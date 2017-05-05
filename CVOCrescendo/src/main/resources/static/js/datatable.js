$(document).ready( function () {
    var table = $('#studentsTable').DataTable({
        "sAjaxSource": "/students",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "firstName" },
            { "mData": "lastName" },
        ]
    })
});
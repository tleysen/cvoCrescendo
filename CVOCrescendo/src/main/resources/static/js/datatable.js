$(document).ready( function () {
    var table = $('#studentsTable').DataTable({
        "sAjaxSource": "/teachers",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "firstName" },
            { "mData": "lastName" },
        ]
    })
});
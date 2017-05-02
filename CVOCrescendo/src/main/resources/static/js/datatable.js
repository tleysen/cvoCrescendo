$(document).ready( function () {
    var table = $('#studentsTable').DataTable({
        "sAjaxSource": "/students",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "id"},
            { "mData": "firstName" },
            { "mData": "lastName" },
            { "mData": "nickName" },
            { "mData": "bankAccountNr" },
            { "mData": "dateOfBirth" },
            { "mData": "sex" },
            { "mData": "loginName" },
            { "mData": "password" },
            { "mData": "email" },
            { "mData": "phone" },
            { "mData": "address" },
            { "mData": "stamNr" },
        ]
    })
});
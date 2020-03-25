var globals = {}; // application wide global variable

globals.constants = {
}

globals.showToastMessage = function(heading, message, icon) {
    $.toast({
        heading: heading,
        text: message,
        showHideTransition: 'slide',
        icon: icon  // info, error, warning, success
    });
};

globals.makeGraphQLRequest = function(url, params, successCallback) {
    var self = this;
    $.ajax({
        url: "http://localhost:9000/graphql",
        method: 'post',
        data: params,
        dataType: 'json',
        success: function(response) {
            if (response.data) {
                successCallback(response.data);
            } else {
                self.showToastMessage('Error', 'Server side error', 'error');
            }
        },
        error: globals.ajaxErrorHandler
    });
}


$(document).ready(function() {
   
    });

    globals.makeGraphQLRequest('graphql', {
        query: `query {
            students {
                id name 
            }
        }`
    }, function successCallback(data) {
        var user = data.profile;
        if (user.error) {
            globals.showToastMessage('Error', user.error, 'error');
        } else {
            // populate my profile
   
            $('#Student input[name="name"]').val(user.name);
                    .attr('checked', 'checked').click();
            }
    });

});
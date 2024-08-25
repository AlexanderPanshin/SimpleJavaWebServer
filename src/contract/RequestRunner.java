package contract;

import pojos.HttpRequest;
import pojos.HttpResponse;

public interface RequestRunner {
    HttpResponse run(HttpRequest request);
}

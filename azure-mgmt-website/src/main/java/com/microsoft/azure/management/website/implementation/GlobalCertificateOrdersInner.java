/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in GlobalCertificateOrders.
 */
public final class GlobalCertificateOrdersInner {
    /** The Retrofit service to perform REST calls. */
    private GlobalCertificateOrdersService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of GlobalCertificateOrdersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public GlobalCertificateOrdersInner(Retrofit retrofit, WebSiteManagementClientImpl client) {
        this.service = retrofit.create(GlobalCertificateOrdersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for GlobalCertificateOrders to be
     * used by Retrofit to perform actually REST calls.
     */
    interface GlobalCertificateOrdersService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.CertificateRegistration/certificateOrders")
        Observable<Response<ResponseBody>> getAllCertificateOrders(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.CertificateRegistration/validateCertificateRegistrationInformation")
        Observable<Response<ResponseBody>> validateCertificatePurchaseInformation(@Path("subscriptionId") String subscriptionId, @Body CertificateOrderInner certificateOrder, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> getAllCertificateOrdersNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all domains in a subscription.
     *
     * @return the PagedList&lt;CertificateOrderInner&gt; object if successful.
     */
    public PagedList<CertificateOrderInner> getAllCertificateOrders() {
        ServiceResponse<Page<CertificateOrderInner>> response = getAllCertificateOrdersSinglePageAsync().toBlocking().single();
        return new PagedList<CertificateOrderInner>(response.getBody()) {
            @Override
            public Page<CertificateOrderInner> nextPage(String nextPageLink) {
                return getAllCertificateOrdersNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
    }

    /**
     * Lists all domains in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<CertificateOrderInner>> getAllCertificateOrdersAsync(final ListOperationCallback<CertificateOrderInner> serviceCallback) {
        return AzureServiceCall.create(
            getAllCertificateOrdersSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<CertificateOrderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CertificateOrderInner>>> call(String nextPageLink) {
                    return getAllCertificateOrdersNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all domains in a subscription.
     *
     * @return the observable to the PagedList&lt;CertificateOrderInner&gt; object
     */
    public Observable<Page<CertificateOrderInner>> getAllCertificateOrdersAsync() {
        return getAllCertificateOrdersWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<CertificateOrderInner>>, Page<CertificateOrderInner>>() {
                @Override
                public Page<CertificateOrderInner> call(ServiceResponse<Page<CertificateOrderInner>> response) {
                    return response.getBody();
                }
            });
    }

    /**
     * Lists all domains in a subscription.
     *
     * @return the observable to the PagedList&lt;CertificateOrderInner&gt; object
     */
    public Observable<ServiceResponse<Page<CertificateOrderInner>>> getAllCertificateOrdersWithServiceResponseAsync() {
        return getAllCertificateOrdersSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<CertificateOrderInner>>, Observable<ServiceResponse<Page<CertificateOrderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CertificateOrderInner>>> call(ServiceResponse<Page<CertificateOrderInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(getAllCertificateOrdersNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all domains in a subscription.
     *
     * @return the PagedList&lt;CertificateOrderInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CertificateOrderInner>>> getAllCertificateOrdersSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getAllCertificateOrders(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CertificateOrderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CertificateOrderInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CertificateOrderInner>> result = getAllCertificateOrdersDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CertificateOrderInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<CertificateOrderInner>> getAllCertificateOrdersDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<CertificateOrderInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<CertificateOrderInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Validate certificate purchase information.
     *
     * @param certificateOrder Certificate order
     * @return the Object object if successful.
     */
    public Object validateCertificatePurchaseInformation(CertificateOrderInner certificateOrder) {
        return validateCertificatePurchaseInformationWithServiceResponseAsync(certificateOrder).toBlocking().single().getBody();
    }

    /**
     * Validate certificate purchase information.
     *
     * @param certificateOrder Certificate order
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Object> validateCertificatePurchaseInformationAsync(CertificateOrderInner certificateOrder, final ServiceCallback<Object> serviceCallback) {
        return ServiceCall.create(validateCertificatePurchaseInformationWithServiceResponseAsync(certificateOrder), serviceCallback);
    }

    /**
     * Validate certificate purchase information.
     *
     * @param certificateOrder Certificate order
     * @return the observable to the Object object
     */
    public Observable<Object> validateCertificatePurchaseInformationAsync(CertificateOrderInner certificateOrder) {
        return validateCertificatePurchaseInformationWithServiceResponseAsync(certificateOrder).map(new Func1<ServiceResponse<Object>, Object>() {
            @Override
            public Object call(ServiceResponse<Object> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Validate certificate purchase information.
     *
     * @param certificateOrder Certificate order
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> validateCertificatePurchaseInformationWithServiceResponseAsync(CertificateOrderInner certificateOrder) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (certificateOrder == null) {
            throw new IllegalArgumentException("Parameter certificateOrder is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(certificateOrder);
        return service.validateCertificatePurchaseInformation(this.client.subscriptionId(), certificateOrder, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = validateCertificatePurchaseInformationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> validateCertificatePurchaseInformationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all domains in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;CertificateOrderInner&gt; object if successful.
     */
    public PagedList<CertificateOrderInner> getAllCertificateOrdersNext(final String nextPageLink) {
        ServiceResponse<Page<CertificateOrderInner>> response = getAllCertificateOrdersNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<CertificateOrderInner>(response.getBody()) {
            @Override
            public Page<CertificateOrderInner> nextPage(String nextPageLink) {
                return getAllCertificateOrdersNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
    }

    /**
     * Lists all domains in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<CertificateOrderInner>> getAllCertificateOrdersNextAsync(final String nextPageLink, final ServiceCall<List<CertificateOrderInner>> serviceCall, final ListOperationCallback<CertificateOrderInner> serviceCallback) {
        return AzureServiceCall.create(
            getAllCertificateOrdersNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<CertificateOrderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CertificateOrderInner>>> call(String nextPageLink) {
                    return getAllCertificateOrdersNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all domains in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;CertificateOrderInner&gt; object
     */
    public Observable<Page<CertificateOrderInner>> getAllCertificateOrdersNextAsync(final String nextPageLink) {
        return getAllCertificateOrdersNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<CertificateOrderInner>>, Page<CertificateOrderInner>>() {
                @Override
                public Page<CertificateOrderInner> call(ServiceResponse<Page<CertificateOrderInner>> response) {
                    return response.getBody();
                }
            });
    }

    /**
     * Lists all domains in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;CertificateOrderInner&gt; object
     */
    public Observable<ServiceResponse<Page<CertificateOrderInner>>> getAllCertificateOrdersNextWithServiceResponseAsync(final String nextPageLink) {
        return getAllCertificateOrdersNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<CertificateOrderInner>>, Observable<ServiceResponse<Page<CertificateOrderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CertificateOrderInner>>> call(ServiceResponse<Page<CertificateOrderInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(getAllCertificateOrdersNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all domains in a subscription.
     *
    ServiceResponse<PageImpl<CertificateOrderInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;CertificateOrderInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<CertificateOrderInner>>> getAllCertificateOrdersNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.getAllCertificateOrdersNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<CertificateOrderInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<CertificateOrderInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<CertificateOrderInner>> result = getAllCertificateOrdersNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<CertificateOrderInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<CertificateOrderInner>> getAllCertificateOrdersNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<CertificateOrderInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<CertificateOrderInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}

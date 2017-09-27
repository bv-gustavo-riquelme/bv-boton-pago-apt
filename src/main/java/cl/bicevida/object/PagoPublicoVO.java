package cl.bicevida.object;

import java.util.Date;
import java.util.Hashtable;
import java.util.List;

public class PagoPublicoVO {

    private int idTransaccion;
    private int idNavegacion;
    private Date fechaTransaccion;
    private String xmloriginal;
    private String xmlpagopublico;
    private String xmlconfirmacion;
    private String xmlconfirmacionDataBancos;
    private PagoBancoInfoVo banco = new PagoBancoInfoVo();
    private Date   ultimoVencimientoDeuda;
    private String estadoDeuda = "";//"AL DIA";
    private Double totalPagar;
    private Double valorUF;
    private PagoDatosClienteVO datosCliente;
    private List cuotas;
    private Hashtable hashcuotas = new Hashtable();
    private int idBancoPago;
    private String urlPdfDownload;
    private String urlPdfEnEsperaDownload;
    private String absoluteServerPathPdfDownload;
    private String absoluteServerPathPdfEnEsperaDownload;    
    private String formaPago;
    private String pdfUrlVolantes = null;
    private ResultadoConsultaVO resultadoPagoBanco;
    private int tipoTransaccion;
    private int valormaxaporte;
    private Double cargo;
    private double porcentajeCobroTarjeta;
    private boolean estado;
    private String mensajeRespuesta;
    private Integer codRespuesta;
    private String fechaAccesoUsuario;
    private int medioPago;
    private String tbkURLExitoError;//para el medio de pago 4,9,10 (webpay,BCI)
    private String urlcgi;
    private Integer bancoId;
    private String methodSend;
    private String accion;
	
	public PagoPublicoVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
